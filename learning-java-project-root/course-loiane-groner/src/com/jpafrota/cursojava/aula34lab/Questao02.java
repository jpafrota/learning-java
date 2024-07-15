package com.jpafrota.cursojava.aula34lab;

public class Questao02 {

	public static void imprimir(double num) {
		System.out.println(num);
	}
	
	public static void main(String[] args) {

		imprimir(Calculadora.somar(4, 5));
		imprimir(Calculadora.subtrair(4, 5));
		imprimir(Calculadora.multiplicar(4, 5));
		imprimir(Calculadora.dividir(4, 5));
		imprimir(Calculadora.dividir(4, 0));
		imprimir(Calculadora.potencia(2, 10));
		
	}

}
