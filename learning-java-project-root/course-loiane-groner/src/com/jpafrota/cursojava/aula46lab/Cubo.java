package com.jpafrota.cursojava.aula46lab;

public class Cubo extends Figura3D {

	private double aresta;

	public double getAresta() {
		return aresta;
	}
	public void setAresta(double aresta) {
		this.aresta = aresta;
	}
	
	@Override
	public double calcularArea() {
		return 6 * (aresta * aresta);
	}
	@Override
	public double calcularVolume() {
		return aresta * aresta * aresta;
	}
	
}
