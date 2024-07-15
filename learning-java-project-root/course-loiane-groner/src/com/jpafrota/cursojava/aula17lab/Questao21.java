package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero = scan.nextInt();
		boolean ehPrimo = true;
		
		for(int i = 2; i < numero && ehPrimo == true; i++) {
			
			if(numero % i == 0) {
				ehPrimo = false;
			}
			
		}
		
		System.out.println("É Primo?");
		System.out.println(ehPrimo);
		
	}

}
