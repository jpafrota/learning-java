package com.jpafrota.cursojava.aula33lab;

public class Lampada {

	private boolean ligado;
	
	private int potencia;
	private int tensao;
	private String corDaLuz;
	private String modelo;
	private String tipoIluminacao;
	
	// Construtores
	public Lampada(){ }

	public Lampada(boolean ligado) {
		this.ligado = ligado;
	}
	
	
	// Getters e Setters
	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getTensao() {
		return tensao;
	}

	public void setTensao(int tensao) {
		this.tensao = tensao;
	}

	public String getCorDaLuz() {
		return corDaLuz;
	}

	public void setCorDaLuz(String corDaLuz) {
		this.corDaLuz = corDaLuz;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipoIluminacao() {
		return tipoIluminacao;
	}

	public void setTipoIluminacao(String tipoIluminacao) {
		this.tipoIluminacao = tipoIluminacao;
	}
	// End-Getters and Setters
	
	// métodos
	public void interruptor() {
		this.setLigado(!this.isLigado());;
	}
	
	public void ligar() {
		this.setLigado(true);
	}
	
	public void desligar() {
		this.setLigado(false);
	}
	
	public void mostrarEstado() {
		if(this.isLigado()) System.out.println("Lâmpada ligada.");
		else System.out.println("Lâmpada desligada.");
	}
	
}
