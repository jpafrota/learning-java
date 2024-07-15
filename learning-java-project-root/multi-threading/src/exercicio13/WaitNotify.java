package exercicio13;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Monitor class
class Deposito {

	// True if thread should wait, false if it's access is allowed.
	private boolean moving = false;
	private int qtdItens;
	private int capMaxima;
	

	// Constructors
	public Deposito(int capMaxima) {
		this.qtdItens = 1;
		this.capMaxima = capMaxima;
	}
	
	public Deposito(int qtdItens, int capMaxima) {
		this.qtdItens = qtdItens;
		this.capMaxima = capMaxima;
	}
	
	// Methods
	public synchronized void armazenar() {
		
		while (moving) {
            try { 
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt(); 
            }
        }
		
		moving = true;
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(this.qtdItens + 1 > capMaxima) {
			System.out.println("Box is full.");
			System.out.println("No items added. | Qtd: " + this.qtdItens + "\n");
		}
		
		else {
			this.qtdItens += 1;
			System.out.println("Added 1 item in the box. | Qtd: " + this.qtdItens + "\n");
		}
		
		moving = false;
		notifyAll();
		
	}
	
	public synchronized void retirar() {
		
		while (moving) {
            try { 
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt(); 
            }
        }
		
		moving = true;
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(this.qtdItens == 0) {
			System.out.println("Box empty.");
			System.out.println("No items removed. | Qtd: " + this.qtdItens + "\n");
		}
		else {
			this.qtdItens -= 1;
			System.out.println("Removed 1 item from the box. | Qtd: " + this.qtdItens + "\n");
		}
		
		moving = false;
		notifyAll();
		
	}
	
	public int getQtdItens() {
		return this.qtdItens;
	}
	
}

public class WaitNotify {

	static class Consumidor extends Thread {

		// Attributes
		private Deposito deposito;
		private int productionGap;
		private int id;
		
		// Constructors
		public Consumidor(Deposito deposito, int productionGap, int id) {
			this.productionGap = productionGap;
			this.deposito = deposito;
			this.id = id;
		}
		
		// Methods
		public void run() {

			System.out.println("> Starting Consumer " + this.id + "\n");
			System.out.println("Consumer " + this.id + " trying to remove from the box...");

			
			deposito.retirar();
			try {
				Thread.sleep(this.productionGap);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("> Completed Consumer " + this.id + "\n");

		}
		
	}

	static class Produtor extends Thread {

		// Attributes
		private int productionGap;
		private Deposito deposito;
		private int id;
		
		// Constructors
		public Produtor(Deposito deposito, int productionGap, int id) {
			super();
			this.productionGap = productionGap;
			this.deposito = deposito;
			this.id = id;
		}

		// Methods
		public void run() {

			System.out.println("> Starting Producer " + this.id + "\n");
			System.out.println("Producer " + this.id + " trying to add in the box...");
			
			deposito.armazenar();
			try {
				Thread.sleep(this.productionGap);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("> Completed Producer " + this.id + "\n");

		}
		
	}
	
	public static void main(String[] args) {

		// New Deposit with maximum capacity of 3 items
		Deposito deposito = new Deposito(3);

		Random gerador = new Random();
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for (int i = 0; i < 10; i++) {
			executor.submit(new Produtor(deposito, gerador.nextInt(201), i+1));
			executor.submit(new Consumidor(deposito, gerador.nextInt(201), i+1));
		}
		
		executor.shutdown();
		
		System.out.println("> All tasks submitted.");
		
		try {
			executor.awaitTermination(30, TimeUnit.SECONDS);
		} catch (InterruptedException ignored) {}
		
		System.out.println("> All tasks completed.");
		
		System.out.println(">> Items left in the box: " + deposito.getQtdItens());
		
	}

}
