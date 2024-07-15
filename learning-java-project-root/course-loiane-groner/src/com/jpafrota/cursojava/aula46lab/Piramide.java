package com.jpafrota.cursojava.aula46lab;

public class Piramide extends Figura3D {

	private double altura;
	private double arestaBase;
	private double apotema;
	private double numPoliBase;
	
	private Figura2D base;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getArestaBase() {
		return arestaBase;
	}
	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}
	public double getApotema() {
		return apotema;
	}
	public void setApotema(double apotema) {
		this.apotema = apotema;
	}
	public Figura2D getBase() {
		return base;
	}
	public void setBase(Figura2D base) {
		this.base = base;
	}
	public double getNumPoliBase() {
		return numPoliBase;
	}
	public void setNumPoliBase(double numPoliBase) {
		this.numPoliBase = numPoliBase;
	}
	
	@Override
	public double calcularArea() {
		double areaLateral = (numPoliBase * arestaBase * apotema)/2;
		if(base != null) {
			return base.calcularArea() + areaLateral;
		}
		return 0;
	}
	
	@Override
	public double calcularVolume() {
		if(base != null) {
			return base.calcularArea();
		}
		return 0;
	}
	
	
	
}
