package com.jpafrota.cursojava.aula34lab;

public class Fatorial {

	public static double calcularFatorial(int num) {
		
		double resultado = num;
		for(int i = num-1; i >= 1; i--) {
			resultado *= i;
		}
		
		return resultado;
		
	}
	
}
