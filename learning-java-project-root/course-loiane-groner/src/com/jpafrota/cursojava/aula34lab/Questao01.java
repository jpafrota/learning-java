package com.jpafrota.cursojava.aula34lab;

public class Questao01 {

	public static void imprimir() {
		System.out.println(Contador.retornar());
	}
	
	public static void main(String[] args) {

		imprimir();
		
		Contador.incrementar();
		Contador.zerar();
		Contador.incrementar();
		Contador.incrementar();
		
		imprimir();
		
	}

}
