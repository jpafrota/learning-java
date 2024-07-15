package com.jpafrota.cursojava.aula46lab;

public class Cilindro extends Figura3D {

	private double raio;
	private double altura;
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		
		double areaBase = Math.PI * (raio * raio);
		double comprimentoCirc = 2 * Math.PI * raio;
		double areaLateral = comprimentoCirc * altura;
		
		return (2*areaBase) + areaLateral;
		
	}
	
	@Override
	public double calcularVolume() {
		double areaBase = Math.PI * (raio * raio);
		return areaBase * altura;
	}
	
}
