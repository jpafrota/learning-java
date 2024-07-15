package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero = scan.nextInt();
		boolean ehPrimo = true;
		
		System.out.print("Divisores: | ");
		
		for(int i = 1; i <= numero; i++) {
			
			if(numero % i == 0) {
				if(i != 1 && i != numero) ehPrimo = false;
				System.out.print(i + " | ");
			}
			
		}
		
		System.out.println("\nÉ Primo?");
		System.out.println(ehPrimo);
		
	}

}
