package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao35 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o valor maximo do intervalo: ");
		int numero = scan.nextInt();
		boolean ehPrimo = true;

		for (int i = 2; i < numero; i++) {

			for (int j = 2; j < i && ehPrimo == true; j++) {

				if (i % j == 0) {
					ehPrimo = false;
				}

			}

			if(ehPrimo) System.out.println(i + ": " + ehPrimo);
			
			ehPrimo = true;
		}
	}

}
