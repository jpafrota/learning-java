package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao42 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int entrada;
		
		int intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, intervalo4 = 0;
		
		do {
			
			System.out.print("Entre com um numero: ");
			entrada = scan.nextInt();
			
			if(entrada < 0) break;
			
			if(entrada <= 25) {
				intervalo1++;
			}
			else if(entrada <= 50) {
				intervalo2++;
			}
			else if(entrada <= 75) {
				intervalo3++;
			}
			else if(entrada <= 100) {
				intervalo4++;
			}
			
		} while(entrada >= 0); 
		
		System.out.println("[0-25]: " + intervalo1);
		System.out.println("[26-50]: " + intervalo2);
		System.out.println("[51-75]: " + intervalo3);
		System.out.println("[76-100]: " + intervalo4);
		
	}

}
