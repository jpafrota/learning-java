package exercicio15;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class ProblemaDosFumantes {

	// Agente inicia com o semáforo liberado
	public static Semaphore semaforoAgente = new Semaphore(1);
	public static Semaphore[] semaforoFumantes = new Semaphore[3];
	public static String ingredienteFaltante = "";
	public static int count = 0;
	
	static class Agente extends Thread {
		
		public String sortearIngredientes() {
			
			Random rand = new Random();
			int gerador = rand.nextInt(3) + 1;
			
			switch (gerador) {
			case 1:
				System.out.println("A mesa possui papel e fosforo.");
				return "Tabaco";
			case 2:
				System.out.println("A mesa possui tabaco e fosforo.");
				return "Papel";
			default: 
				System.out.println("A mesa possui tabaco e papel.");
				return "Fosforo";
			}
			
		}
		
		public void run () {
			
			while (true) {
				try {
					semaforoAgente.acquire();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				String ingredienteFaltante = sortearIngredientes();
				
				if (ingredienteFaltante.equals("Tabaco")) {
					semaforoFumantes[0].release();
				} else if (ingredienteFaltante.equals("Papel")) {
					semaforoFumantes[1].release();
				} else {
					semaforoFumantes[2].release();
				}
			}
			
		}
		
	}

	static class Fumante extends Thread {
		
		private int num;
		
		public int getNum() {
			return this.num;
		}
		
		public Fumante () {
			num = count;
			count++;
		}
		
		public void run() {
			
			while (true) {
				
				try {
					semaforoFumantes[this.getNum()].acquire();
					System.out.println(this.getName() + " fumando ....");
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				semaforoAgente.release();
				
			}
			
			
		}
		
	}
	
	public static void main(String[] args) {

		// Fumantes iniciam bloqueados
		for (int i = 0; i < 3; i++) {
			semaforoFumantes[i] = new Semaphore(0);
		}
		
		Agente agente = new Agente();
		
		agente.start();
		
		Fumante fumante1 = new Fumante();
		Fumante fumante2 = new Fumante();
		Fumante fumante3 = new Fumante();
		
		fumante1.setName("Fumante 1");
		fumante2.setName("Fumante 2");
		fumante3.setName("Fumante 3");
		
		fumante1.start(); fumante2.start(); fumante3.start();
		
	}

}
