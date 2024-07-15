package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero = 0, resultado = 0;

		while (numero >= 0 && numero <= 16) {
			
			numero = scan.nextInt();
			resultado = numero;
			
			for (int i = numero - 1; i > 0; i--) {

				resultado = resultado * i;

			}

			if (numero == 0)
				resultado = 1;

			System.out.println("Fatorial de " + numero + ": " + resultado);

		}

	}

}
