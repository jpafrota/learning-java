package exercicio14;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class JantarDosFilosofosNoDeadLock {

	public static final int N = 5;
	public static Semaphore semaphore[] = new Semaphore[N];
	
	static class Filosofo extends Thread {
		
		private int i;
		
		public Filosofo(int i) {
			this.i = i;
		}
		
		// Waits a random time when no hashis have been picked up
		public void pense() {
			Random rand = new Random();
			int tempo = rand.nextInt(700) + 100;
			System.out.println("Filosofo " + i + " pensando...");
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// Waits a random time after picking up hashis
		public void coma() {
			Random rand = new Random();
			int tempo = rand.nextInt(700) + 100;
			System.out.println("Filosofo " + i + " comendo...");
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		public void pegue_hashi(int i) {
			
			System.out.println("Tentando pegar hashi " + i);
			try {
				semaphore[i].acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		public void libere_hashi(int i) {
			System.out.println("Soltando hashi " + i);
			semaphore[i].release();
		}
		
		public void run() {
			
			while(true) {
				if (i % 2 == 0) {
					pense(); pegue_hashi(i); pegue_hashi((i+1) % N); 
					coma();	libere_hashi((i+1) % N); libere_hashi(i);
				} else {
					pense(); pegue_hashi((i+1) % N); pegue_hashi(i);
					coma();	libere_hashi(i); libere_hashi((i+1) % N);
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(N);
		
		for(int i = 0; i < N; i++) {
			semaphore[i] = new Semaphore(1);
		}
		
		for (int i = 0; i < N; i++) {
			executor.submit(new Filosofo(i));
		}
		
		executor.shutdown();

		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
