package multithreading;

import java.util.concurrent.Phaser;

public class PhaserDemo {
	public static void main(String[] args) {
		Phaser phaser = new Phaser(3);
		Thread t1 = new Thread(new Student1(phaser,1000),"Anu");
		Thread t2 = new Thread(new Student1(phaser,2000),"Ambe");
		Thread t3 = new Thread(new Student1(phaser,3000),"Anjali");
		t1.start();
		t2.start();
		t3.start();
			phaser.awaitAdvance(0);
		System.out.println("let's go");
	}

}
class Student1 implements Runnable{
	private Phaser phaser;
	private long duration;
	

	public Student1(Phaser phaser, long duration) {
		super();
		this.phaser = phaser;
		this.duration= duration;
	}


	@Override
	public void run() {
		try {
			Thread.sleep(duration);
			System.out.println(Thread.currentThread().getName());
		phaser.arrive();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}

