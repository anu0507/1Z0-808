package multithreading;



import java.util.concurrent.ArrayBlockingQueue; 
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * BlockingQueue(I) :- This interface extends Queue interface. In BlockingQueue, if the 
 * Queue is empty, it waits(i.e blocks) for an elements to be inserted and if the queue is
 * full, it waits for an element to be removed from the queue.
 * It follows FIFO.
 * It is bounded in nature.
 * and its implementation classes:-
 * 1.ArrayBlockingQueue:- This class provides a fixed size Array based implementation of the 
 * BlockingQueue interface.
 * 
 * 2.LinkedBlockingQueue:- This class provides a LinkedList based implementation of the 
 * BlockingQueue interface.
 * 
 * 3.PriorityBlockingQueue:- It is equivalent to java.util.PriorityQueue but implements
 * the BlockingQueue interface.
 * You cannot insert null value.
 * It is an unbounded in nature. If you not specify the size then default size will be 
 * max value of integer(Integer.MAX_value).
 * 
 * 4.SynchronousQueue:- It is a single sized queue.It is suitable for hand off situation.
 * 
 * 5.DelayQueue:- This class implements BlockingQueue and consists of elements that are
 * of type Delayed.An element can be retrieved from this queue only after its delay period.
 * 
 * 
 */
public class BlockingQueueDemo {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(5);
		   BlockingQueue queue = new ArrayBlockingQueue(1024);

	        service.submit(new Produce(queue));
	        service.submit(new Consume(queue));

	       

	        try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }

}
class Produce implements Runnable{

    protected BlockingQueue queue = null;

    public Produce(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            queue.put("1");
            Thread.sleep(1000);
            queue.put("2");
            Thread.sleep(1000);
            queue.put("3");
            System.out.println(Thread.currentThread().getName() + " produce data"); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Consume implements Runnable{

    protected BlockingQueue queue = null;

    public Consume(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(Thread.currentThread().getName() + " consume data");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


