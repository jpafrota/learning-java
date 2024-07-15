package com.jpafrota.cursojava.aula25a27lab;

public class Lampada {

	int potencia;
	int tensao;
	String corDaLuz;
	String modelo;
	String tipoIluminacao;
	
	boolean ligado = false;
	
	void interruptor() {
		ligado = !ligado;
	}
	
	void ligar() {
		ligado = true;
	}
	
	void desligar() {
		ligado = false;
	}
	
}
