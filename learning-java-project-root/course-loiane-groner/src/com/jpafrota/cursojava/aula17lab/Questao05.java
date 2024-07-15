package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int popA, popB;
		double taxaA, taxaB;
		int anos = 0;
		
		// Populaãoo A
		do {
			
			System.out.print("Entre com o valor da populaãoo A: ");
			popA = scan.nextInt();
			if(popA <= 0) System.out.println("ERRO! Valor deve ser maior que zero.");
			
		} while (popA <= 0);
		
		// Populaãoo B
		do {
			
			System.out.print("Entre com o valor da populaãoo B: ");
			popB = scan.nextInt();
			if(popB <= 0) System.out.println("ERRO! Valor deve ser maior que zero.");
			
		} while (popB <= 0);
		
		// Taxa popA
		do {
			
			System.out.print("Entre com o valor da taxa de crescimento da populacao A: ");
			taxaA = scan.nextDouble();
			if(taxaA <= 0) System.out.println("ERRO! Valor deve ser maior que zero.");
			
		} while (taxaA <= 0);

		// Taxa popB
		do {
			
			System.out.print("Entre com o valor da taxa de crescimento da populacao B: ");
			taxaB = scan.nextDouble();
			if(taxaB <= 0) System.out.println("ERRO! Valor deve ser maior que zero.");
			if(taxaB >= taxaA) System.out.println("ERRO! Valor deve ser menor que a taxa de crescimento de A.");
			
		} while (taxaB <= 0 || taxaB >= taxaA);
		
		while(popA < popB) {
			
			popA += (popA/100)*taxaA;
			popB += (popB/100)*taxaB;
			anos++;
			
		}
		
		System.out.println("\nAnos passados: " + anos);
		System.out.println("Valor da populaãoo da cidade A: " + popA);
		System.out.println("Valor da populaãoo da cidade B: " + popB);
		
	}

}
