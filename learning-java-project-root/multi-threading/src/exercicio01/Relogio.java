package exercicio01;

class contadorTempo {

	private int tick;
	
	// Constructors
	public contadorTempo(int tick) {
		this.tick = tick;
	}

	public contadorTempo() {
		tick = 0;
	}
	
	// Getter
	public int getTick() {
		return this.tick;
	}
	
	// Methods
	public void nextTick() {
		this.tick += 1;
	}
	
}

public class Relogio extends Thread {
	
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
	
	public static void main(String[] args) {
		
		// Thread instantiation
		Relogio relogio1 = new Relogio(0, 5);
		Relogio relogio2 = new Relogio(0, 5);
		Relogio relogio3 = new Relogio(0, 5);
		
		relogio1.start();
		relogio2.start();
		relogio3.start();
		
	}
	
}