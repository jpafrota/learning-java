package exercicio06;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Deposito {

	private int qtdItens;
	private int capMaxima;

	private final Object lock1 = new Object();

	// Constructors
	public Deposito(int capMaxima) {
		this.qtdItens = 0;
		this.capMaxima = capMaxima;
	}

	public Deposito(int qtdItens, int capMaxima) {
		this.qtdItens = qtdItens;
		this.capMaxima = capMaxima;
	}

	// Methods
	public void armazenar() {

		// Explicit Lock
		synchronized (lock1) {
			
			System.out.println("Tentando adicionar na caixa...");

			if (this.qtdItens + 1 > capMaxima) {
				System.out.println("Capacidade máxima atingida.");
				System.out.println("Nenhum item adicionado. | Qtd: " + this.qtdItens + "\n");
			}

			else {
				this.qtdItens += 1;
				System.out.println("1 item foi adicionado na caixa. | Qtd: " + this.qtdItens + "\n");
			}

		}

	}

	public void retirar() {

		// Explicit Lock
		synchronized (lock1) {

			System.out.println("Tentando retirar da caixa...");

			if (this.qtdItens == 0) {
				System.out.println("Não há itens na caixa.");
				System.out.println("Nenhum item retirado. | Qtd: " + this.qtdItens + "\n");
			} else {
				this.qtdItens -= 1;
				System.out.println("1 item foi retirado da caixa. | Qtd: " + this.qtdItens + "\n");
			}

		}

	}

}

public class ThreadPools {
	
	// Quantidade de operações por consumidor/produtor
	public static final int MAX = 3;

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

			System.out.println("> Starting CONSUMIDOR " + this.id);

			for (int i = 0; i < MAX; i++) {

				deposito.retirar();
				try {
					Thread.sleep(this.productionGap);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			
			System.out.println("> Completed CONSUMIDOR " + this.id);

		}

	}

	static class Produtor implements Runnable {

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

			System.out.println("> Starting PRODUTOR " + this.id);

			for (int i = 0; i < MAX; i++) {

				deposito.armazenar();
				try {
					Thread.sleep(this.productionGap);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			
			System.out.println("> Completed CONSUMIDOR " + this.id);

		}

	}

	// Main
	public static void main(String[] args) throws InterruptedException {

		// New Deposit with maximum capacity of 3 itens
		Deposito deposito = new Deposito(3);

		Random gerador = new Random();
		ExecutorService executor = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 20; i++) {
			executor.submit(new Produtor(deposito, gerador.nextInt(201), i+1));
			executor.submit(new Consumidor(deposito, gerador.nextInt(201), i+1));
		}

		executor.shutdown();
		
		System.out.println("> All tasks submitted.");
		
		try {
			executor.awaitTermination(15, TimeUnit.SECONDS);
		} catch (InterruptedException ignored) {}
		
		System.out.println("> All tasks completed.");

	}

}