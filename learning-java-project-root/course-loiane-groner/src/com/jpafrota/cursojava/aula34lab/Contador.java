package com.jpafrota.cursojava.aula34lab;

public class Contador {

	private static int cont = 0;
	
	public Contador() {
		cont++;
	}
	
	public static void incrementar() {
		cont++;
	}
	public static void zerar() {
		cont = 0;
	}
	public static int retornar() {
		return cont;
	}
	
}
