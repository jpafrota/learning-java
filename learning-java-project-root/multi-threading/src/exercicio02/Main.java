package exercicio02;

public class Main {

	public static void main(String[] args) {

		// Thread instantiation
		Thread relogio1 = new Thread(new Relogio(0, 5));
		Thread relogio2 = new Thread(new Relogio(0, 5));
		Thread relogio3 = new Thread(new Relogio(0, 5));
		
		relogio1.start();
		relogio2.start();
		relogio3.start();
		
	}

}
