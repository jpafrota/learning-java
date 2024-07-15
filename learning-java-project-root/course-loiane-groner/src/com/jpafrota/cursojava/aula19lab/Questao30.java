package com.jpafrota.cursojava.aula19lab;

import java.util.Scanner;

public class Questao30 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[20];
		int[] vetB = new int[20];
		int[] vetC = new int[20];
		
		int posB = 0;
		int posC = 0;
		for(int i = 0; i < vetA.length; i++) {
			
			vetA[i] = i + 1;
			
			if(vetA[i] % 2 == 0) {
				vetB[posB] = vetA[i];
				posB++;
			}
			else {
				vetC[posC] = vetA[i];
				posC++;
			}
			
		}
		
		System.out.println("Vetor A: ");
		for(int aux : vetA) {
			System.out.print(aux + " | ");
		}
		
		System.out.println("\n\nPares: ");
		for(int i = 0; i < posB; i++) {
			System.out.print(vetB[i] + " | ");
		}
		
		System.out.println("\nímpares: ");
		for(int i = 0; i < posC; i++) {
			System.out.print(vetC[i] + " | ");
		}
	}

}
