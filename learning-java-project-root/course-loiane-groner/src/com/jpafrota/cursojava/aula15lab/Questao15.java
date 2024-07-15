package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Entre com o primeiro lado do triangulo: ");
		double lado1 = scan.nextDouble();

		System.out.print("Entre com o segundo lado do triangulo: ");
		double lado2 = scan.nextDouble();

		System.out.print("Entre com o terceiro lado do triangulo: ");
		double lado3 = scan.nextDouble();
		
		String tipo;
		
		if ((lado1 + lado2) > lado3 && (lado2 + lado3) > lado1 && (lado1 + lado3) > lado2) {

			if (lado1 == lado2 && lado3 == lado1 && lado3 == lado2) {
				tipo = "EQUILÁTERO";
			}

			else if (lado1 == lado2 || lado3 == lado1 || lado3 == lado2) {
				tipo = "ISÓSCELES";
			}

			else {
				tipo = "ESCALENO";
			}

			System.out.println("A figura informada é um triângulo do tipo: " + tipo);

		}
		
		else {
			System.out.println("A figura informada não é um triângulo.");
		}
		
		
	}
}