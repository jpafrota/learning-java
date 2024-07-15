package exercicio02;

public class contadorTempo {

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
	public void setTick(int tick) {
		this.tick = tick;
	}
	
	// Methods
	public void nextTick() {
		this.tick += 1;
	}
	
}
