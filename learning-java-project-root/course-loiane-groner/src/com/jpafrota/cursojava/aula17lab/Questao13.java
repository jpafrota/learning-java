package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int base = scan.nextInt();
		int expoente = scan.nextInt();
		
		double resultado = base;
		
		if(expoente == 0) {
			System.out.println(1);
		}
		
		else {
			
			for(int i = 0; i < expoente-1; i++) {
			
				resultado *= base;
			
			}
			
			System.out.println(resultado);
			
		}
			
	}

}
