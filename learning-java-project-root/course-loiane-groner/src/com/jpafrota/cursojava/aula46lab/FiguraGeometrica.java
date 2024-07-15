package com.jpafrota.cursojava.aula46lab;

public abstract class FiguraGeometrica {

	private String nome;
	private String cor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		String s = this.nome + "\n";
		s += "Cor: " + this.cor + "\n";
		return s;
	}
	
}
