package com.jpafrota.cursojava.aula43lab;

public class Mamifero extends Animal {

	public String alimento;

	public Mamifero() {
		this.setAmbiente("Terra");
	}
	
	public String getAlimento() {
		return alimento;
	}
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public String toString() {
		
		String s = "";
		if(this.alimento != null) {
			s = "Alimento: " + this.alimento + "\n";
		}
		
		return super.toString() + s;
		
	}
	
}
