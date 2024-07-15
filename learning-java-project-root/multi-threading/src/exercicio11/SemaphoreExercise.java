package exercicio11;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class SemaphoreExercise {

	static class ContaBancaria {
		
		private int saldo;
		
		public ContaBancaria(int saldoInicial) {
			this.saldo = saldoInicial;
		}
		
		public int getSaldo() {
			return this.saldo;
		}
		
		public void depositar (int quantia) {
			this.saldo += quantia;
		}
		
		public void retirar (int quantia) {
			this.saldo -= quantia;
		}
		
	}

	static class Cliente extends Thread {
		
		private Semaphore semaphore;
		private ContaBancaria conta;
		
		public Cliente (Semaphore semaphore, ContaBancaria conta) {
			this.semaphore = semaphore;
			this.conta = conta;
		}
		
		public void run () {
			
			try {
				System.out.println("Thread " + this.getName() + " acquiring lock...");
				semaphore.acquire();
				System.out.println("Thread " + this.getName() + " acquired lock!");
				
				Random rand = new Random();
				
				for (int i = 0; i < 4; i++) {
					
					int quantia = rand.nextInt(100);
					
					if(this.getName().equals("Homem")) {
						System.out.print("Thread " + this.getName() + " withdrawing: " + quantia);
						this.conta.retirar(quantia);
						System.out.println(" | New Balance: " + conta.getSaldo());
					} else {
						System.out.print("Thread " + this.getName() + " depositing: " + quantia);
						this.conta.depositar(quantia);
						System.out.println(" | New Balance: " + conta.getSaldo());
					}
					
					Thread.sleep(rand.nextInt(5000) + 1000);
					
				}
				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread " + this.getName() + " released lock.");
			semaphore.release();
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {

		Semaphore semaphore = new Semaphore(1);
		
		ContaBancaria conta = new ContaBancaria(1000);
		
		Cliente homem = new Cliente(semaphore, conta);
		homem.setName("Homem");
		
		Cliente mulher = new Cliente(semaphore, conta);
		mulher.setName("Mulher");
		
		homem.start(); mulher.start();
		
		homem.join(); mulher.join();
		
		System.out.println("Final balance: " + conta.getSaldo());
		
	}

}
