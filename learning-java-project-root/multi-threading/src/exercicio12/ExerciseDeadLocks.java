package exercicio12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExerciseDeadLocks {

	static Lock lock1 = new ReentrantLock();
	static Lock lock2 = new ReentrantLock();
	
	public static void acquire(Lock firstLock, Lock secondLock) throws InterruptedException {
		while (true) {
			boolean gotFirstLock = false;
			boolean gotSecondLock = false;
			try {
				gotFirstLock = firstLock.tryLock();
				gotSecondLock = secondLock.tryLock();
			} finally {
				if (gotFirstLock && gotSecondLock) return;
				else if (gotFirstLock) firstLock.unlock();
				else if (gotSecondLock) secondLock.unlock();
			}
			Thread.sleep(1);
		}
	}
	
	public static void release(Lock firstLock, Lock secondLock) {
		firstLock.unlock();
		secondLock.unlock();
	}
	
	static class T1 extends Thread {
		
		public void run() {
			
			System.out.println("[T1] " + this.getName() + " Trying to acquire locks!");
			
			try {
				acquire(lock1, lock2);
				System.out.println("[T1] " + this.getName() + " Holding locks...");
				
				Thread.sleep(5000);
				
			} catch (InterruptedException e) { }
			
			release(lock1, lock2);
			System.out.println("[T1] " + this.getName() + " Released locks");
			
		}
		
	}
	
	static class T2 extends Thread {
		
		public void run() {
			
			System.out.println("[T2] " + this.getName() + " Trying to acquire locks!");
			
			try {
				
				acquire(lock2, lock1);
				System.out.println("[T2] " + this.getName() + " Holding locks...");
				
				Thread.sleep(5000);
				
			} catch (InterruptedException e) {}
			
			release(lock2, lock1);
			System.out.println("[T2] " + this.getName() + " Released locks!");
			
		}
		
	}
	
	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 5; i++) {
			executor.submit(new T1());
		}
		for (int i = 0; i < 5; i++) {
			executor.submit(new T2());
		}
		executor.shutdown();
		
		System.out.println("> All tasks submitted.");
		
		try {
			executor.awaitTermination(60, TimeUnit.SECONDS);
		} catch (InterruptedException ignored) {}
		
		System.out.println("> All tasks completed.");
		
	}

}