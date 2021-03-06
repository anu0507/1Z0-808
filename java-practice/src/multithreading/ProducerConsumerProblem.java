package multithreading;

import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

// Inter-thread communication with the help of wait(), notifyAll()
public class ProducerConsumerProblem {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(5);
		MyQueue2 queue = new MyQueue2(10);
		service.submit(new Producer(queue));
		service.submit(new Producer(queue));
		service.submit(new Producer(queue));
		service.submit(new Consumer(queue));
		service.submit(new Consumer(queue));

	}

}

class Producer implements Runnable {
	private MyQueue2 queue;

	public Producer(MyQueue2 queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			queue.put("item");
			System.out.println(Thread.currentThread().getName() + " produce an item");
		}

	}

}

class Consumer implements Runnable {
	private MyQueue2 queue;

	public Consumer(MyQueue2 queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			String item = queue.take();
			System.out.println(Thread.currentThread().getName() + " consume an " + item);
		}
	}

}