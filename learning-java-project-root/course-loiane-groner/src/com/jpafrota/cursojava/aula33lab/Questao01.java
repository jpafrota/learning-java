package com.jpafrota.cursojava.aula33lab;

public class Questao01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada(true);
		
		lampada.mostrarEstado();
		
		lampada.setLigado(false);
		lampada.mostrarEstado();
		
		lampada.interruptor();
		lampada.mostrarEstado();
		
		lampada.ligar();
		lampada.mostrarEstado();
		
		lampada.desligar();
		lampada.mostrarEstado();
		
	}

}
