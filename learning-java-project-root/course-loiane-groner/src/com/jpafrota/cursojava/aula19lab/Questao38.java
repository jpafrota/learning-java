package com.jpafrota.cursojava.aula19lab;

import java.util.Scanner;

public class Questao38 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[5];
		int[] vetB = new int[5];
		
		for(int i = 0; i < vetA.length; i++) {
			
			vetA[i] = scan.nextInt();
			
			
		}
		
		int soma = 0;
		for (int i = 0; i < vetA.length; i++) {
			
			for(int j = i; j < vetA.length; j++) {
				
				soma += vetA[j];
				
			}
			
			vetB[i] = soma;
			soma = 0;
			
		}
		
		for(int aux : vetB) {
			
			System.out.print(aux + " ");
			
		}

	}

}
