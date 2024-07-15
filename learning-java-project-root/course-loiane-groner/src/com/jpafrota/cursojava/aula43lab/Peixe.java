package com.jpafrota.cursojava.aula43lab;

public class Peixe extends Animal {

	public String caracteristicas;

	public Peixe() {
		this.setPatas(0);
		this.setAmbiente("Mar");
	}
	
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	public String toString() {
		
		String s = "Características: " + this.caracteristicas + "\n";
		
		return super.toString() + s;
	}
	
}
