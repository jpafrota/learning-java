package exercicio09;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExercicioCountDownLatch {

	static class Processor extends Thread {
		
		private CountDownLatch latch;

		public Processor (CountDownLatch latch){
			this.latch = latch;
		}
		
		public void run() {
	        // System.out.println("Thread started.");
			
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException ignored) {}
	        
	        System.out.println("Before countDown: " + latch.getCount());
	        latch.countDown();
	        System.out.println("After countDown: " + latch.getCount());
	        
	        // System.out.println("Thread finished.");
	    }
		
	}
	
	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter desired number of threads to run: ");
		int n = scan.nextInt();
		
		System.out.println("Waiting for the " + n + " threads to finish.");
		
		CountDownLatch latch = new CountDownLatch(n);
		
		ExecutorService executor = Executors.newFixedThreadPool(2 * n);
		
		for(int i = 0; i < n; i++) {
			executor.submit(new Processor(latch));
		}
		
		executor.shutdown();
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("All threads finished.");
		
	}

}
