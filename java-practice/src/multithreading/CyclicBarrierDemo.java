package multithreading;
/* use:-
 * Important Methods:-
 * 1.getParties();
 * 2.await(),await(long,timeunit);
 * 3. isBroken();
 * 4.reset();
 * 5.getNumberWaiting();
 * It has 2 constructor:-
 * 1. public CyclicBarrier(int);
 * 2. public CyclicBarrier(int,Runnable);
 * 
 */

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

	public static void main(String[] args) {
		CyclicBarrier barrier = new CyclicBarrier(3);
		Thread t1 = new Thread(new Passenger(barrier, 1000), "kala");
		Thread t2 = new Thread(new Passenger(barrier, 2000), "Anjali");
		Thread t3 = new Thread(new Passenger(barrier, 3000), "Monkey");
		Thread t4 = new Thread(new Passenger(barrier, 4000), "Shail");
		Thread t5 = new Thread(new Passenger(barrier, 5000), "Shradha");
		Thread t6 = new Thread(new Passenger(barrier, 6000), "Khargosh");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();

	}
}

	class Passenger implements Runnable {
		private CyclicBarrier barrier;
		private long duration;

		public Passenger(CyclicBarrier barrier, long duration) {
			super();
			this.barrier = barrier;
			this.duration = duration;
		}

		@Override
		public void run() {
			try {
				Thread.sleep(duration);
				System.out.println(Thread.currentThread().getName()+" is arrived");
				int await = barrier.await();
				if (await == 0) {
					System.out.println("Anu Gaadi Chalu Kar");
				}

			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}

		}

	}


