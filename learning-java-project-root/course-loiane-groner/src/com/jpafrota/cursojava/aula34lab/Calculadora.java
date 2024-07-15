package com.jpafrota.cursojava.aula34lab;

public class Calculadora {

	public static double somar(int valor1, int valor2) {
		
		return (valor1 + valor2);
		
	}
	
	public static double subtrair(int valor1, int valor2) {

		return (valor1 - valor2);
		
	}

	public static double multiplicar(int valor1, int valor2) {

		return (valor1 * valor2);
		
	}
	
	public static double dividir(double valor1, double valor2) {

		if(valor2 != 0) return (valor1 / valor2);
		else return 0;
		
	}
	
	public static double potencia(double base, int expoente) {
		
		double resultado = base;
		for(int i = 0; i < expoente-1; i++) {
			resultado *= base;
		}
		
		return resultado;
		
	}
	
}
