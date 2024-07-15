package com.jpafrota.cursojava.aula43lab;

public abstract class Contribuinte {

	private String nome;
	private double rendaBruta;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	public abstract double calcularImposto();
	
	public String toString() {
		String s = "Nome: " + this.nome;
		s += ", Renda: R$" + this.rendaBruta;
		return s;
	}
	
}
