package exercicio10;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ExercicioCyclicBarrier {

	private CyclicBarrier cyclicBarrier;
	
	class Passageiro extends Thread {

		public void run() {
			String threadName = Thread.currentThread().getName();
			try {
                System.out.println(threadName + " arrived in queue.");
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {}
		}
		
	}

	class VoltaNaMontanha extends Thread {

		public void run() {
			System.out.println("Iniciando volta na montanha russa!");
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Volta completa.");
		}
	
	}
	
	public void runExecutor(int N, int C) {
		
		cyclicBarrier = new CyclicBarrier(C, new VoltaNaMontanha());
		
		System.out.println("Number of threads required to trip the barrier = "+
		        cyclicBarrier.getParties() + "\n");
		
		for(int i = 0; i < N; i++) {
			Passageiro passageiro = new Passageiro();
			passageiro.setName("Passenger " + i);
			passageiro.start();
		}
		
	}

	public static void main(String[] args) {

		int N = 10;
		int C = 2;
		
		ExercicioCyclicBarrier teste = new ExercicioCyclicBarrier();
		
		teste.runExecutor(N, C);
		
	}

}
