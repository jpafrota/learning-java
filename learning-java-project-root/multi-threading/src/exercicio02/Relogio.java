package exercicio02;

public class Relogio implements Runnable {

	// Attributes
	private contadorTempo counter;
	private int qtdTicks;
	private int initialTicks;
	
	// Constructors
	public Relogio(int initialTicks, int qtdTicks) {
		this.initialTicks = initialTicks;
		this.qtdTicks = qtdTicks;
	}
	
	public Relogio(int qtdTicks) {
		this.qtdTicks = qtdTicks;
		this.initialTicks = 0;
	}
	
	public Relogio() {
		this.initialTicks = 0;
	}

	// Run method
	public void run() {
		
		this.counter = new contadorTempo(this.initialTicks);
		
		for(int i = this.initialTicks; i < this.qtdTicks; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("Tick: " + this.counter.getTick() + " | Thread: " + Thread.currentThread().getName());
			this.counter.nextTick();
		}
		

	}
}