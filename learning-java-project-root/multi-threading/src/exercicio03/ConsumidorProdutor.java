package exercicio03;

class Deposito {

	private int qtdItens;
	private int capMaxima;

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
		
		System.out.println("Tentando adicionar na caixa...");

		if(this.qtdItens + 1 > capMaxima) {
			System.out.println("Capacidade máxima atingida.");
			System.out.println("Nenhum item adicionado. | Qtd: " + this.qtdItens + "\n");
		}
		
		else {
			this.qtdItens += 1;
			System.out.println("1 item foi adicionado na caixa. | Qtd: " + this.qtdItens + "\n");
		}
		
	}
	
	public void retirar() {
		
		System.out.println("Tentando retirar da caixa...");

		if(this.qtdItens == 0) {
			System.out.println("Não há itens na caixa.");
			System.out.println("Nenhum item retirado. | Qtd: " + this.qtdItens + "\n");
		}
		else {
			this.qtdItens -= 1;
			System.out.println("1 item foi retirado da caixa. | Qtd: " + this.qtdItens + "\n");
		}
		
	}
	
}

public class ConsumidorProdutor {
	
	public static final int MAX = 3;

	static class Consumidor extends Thread {

		// Attributes
		private Deposito deposito;
		private int productionGap;
		
		// Constructors
		public Consumidor(Deposito deposito, int productionGap) {
			this.productionGap = productionGap;
			this.deposito = deposito;
		}
		
		// Methods
		public void run() {
			
			for(int i = 0; i < MAX; i++) {
				
				deposito.retirar();
				try {
					Thread.sleep(this.productionGap);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
		}
		
	}

	static class Produtor implements Runnable {

		// Attributes
		private int productionGap;
		private Deposito deposito;
		
		// Constructors
		public Produtor(Deposito deposito, int productionGap) {
			super();
			this.productionGap = productionGap;
			this.deposito = deposito;
		}

		// Methods
		public void run() {
			
			for(int i = 0; i < MAX; i++) {
				
				deposito.armazenar();
				try {
					Thread.sleep(this.productionGap);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
		}
		
	}
	
	// Main
	public static void main(String[] args) {
		
		Deposito deposito = new Deposito(3);
		
		Consumidor consumidor1 = new Consumidor(deposito, 3000);
		Consumidor consumidor2 = new Consumidor(deposito, 1000);
		Consumidor consumidor3 = new Consumidor(deposito, 2000);
		Thread produtor1 = new Thread(new Produtor(deposito, 5000));
		Thread produtor2 = new Thread(new Produtor(deposito, 6000));
		Thread produtor3 = new Thread(new Produtor(deposito, 4000));
		
		produtor1.start();
		produtor2.start();
		produtor3.start();
		consumidor1.start();
		consumidor2.start();
		consumidor3.start();
		
	}
	
}
