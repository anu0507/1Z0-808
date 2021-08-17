package multithreading;
/*UseCase:-
 * It can be used as a CyclicBarrier 
 * Important methods:-
 * 1. awaitAdvance(int)// this method we can use instead of CountDownLatch await()
 * 2. arrive()// this method  we can use  instead of CountDownlatch countDown()
 * 3. arriveAndAdvance()// this method we can use intead of CyclicBarrier await()
 * 4.bulkRegister(int)//
 * 5.arriveAndDeregister();
 */

import java.util.concurrent.Phaser;

public class PhaserAsCyclicBarrier {
	public static void main(String[] args) {
		Phaser barrier = new Phaser(3);
		Thread t1 = new Thread(new Passenger1(barrier, 1000), "kala");
		Thread t2 = new Thread(new Passenger1(barrier, 2000), "Anjali");
		Thread t3 = new Thread(new Passenger1(barrier, 3000), "Monkey");
		Thread t4 = new Thread(new Passenger1(barrier, 4000), "Shail");
		Thread t5 = new Thread(new Passenger1(barrier, 5000), "Shradha");
		Thread t6 = new Thread(new Passenger1(barrier, 6000), "Khargosh");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		

	}
}

class Passenger1 implements Runnable {
	private Phaser phaser;
	private long duration;

	public Passenger1(Phaser phaser, long duration) {
		super();
		this.phaser = phaser;
		this.duration = duration;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(duration);
			System.out.println(Thread.currentThread().getName() + " is arrived");
			//System.out.println(phaser.getArrivedParties());
			int await = phaser.arriveAndAwaitAdvance();
			if(phaser.getArrivedParties()==0) {
				System.out.println("Anu gaadi Chalu kar");
				
			}
			//System.out.println(await+phaser.getArrivedParties());
		

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
