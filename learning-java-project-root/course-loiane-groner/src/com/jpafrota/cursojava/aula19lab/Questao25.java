package com.jpafrota.cursojava.aula19lab;

import java.util.Scanner;

public class Questao25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[10];
		int[] vetB = new int[10];
		
		
		
		for(int i = 0; i < vetA.length; i++) {
			
			System.out.print("Digite o valor " + i + " (vetor A): ");
			vetA[i] = scan.nextInt();
			
		}
		
		for(int i = 0; i < vetB.length; i++) {
			
			if(vetA[i] % 2 == 0) vetB[i] = 1;
			else vetB[i] = 0;
			
			System.out.print(vetB[i] + " ");
			
		}
		
		
	}

}
