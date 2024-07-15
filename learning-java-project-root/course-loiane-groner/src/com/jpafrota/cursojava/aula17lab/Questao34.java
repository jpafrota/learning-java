package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao34 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com um valor: ");
		int numero = scan.nextInt();
		boolean ehPrimo = true;
		
		for(int i = 2; i < numero && ehPrimo == true; i++) {
			
			if(numero % i == 0) {
				ehPrimo = false;
			}
			
		}
		
		System.out.print("É Primo: ");
		System.out.println(ehPrimo);
		
	}

}
