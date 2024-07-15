package com.jpafrota.cursojava.aula43lab;

public abstract class Animal {

	private String nome;
	private double comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public String toString() {
		
		String s = "Animal: " + this.nome + "\n";
		s += "Comprimento: " + this.comprimento + "\n";
		s += "Patas: " + this.patas + "\n";
		s += "Cor: " + this.cor + "\n";
		s += "Ambiente: " + this.ambiente + "\n";
		s += "Velocidade: " + this.velocidade + "\n";
		
		return s;
		
	}
	
}
