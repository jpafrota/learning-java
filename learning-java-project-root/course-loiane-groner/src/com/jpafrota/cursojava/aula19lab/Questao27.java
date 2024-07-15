package com.jpafrota.cursojava.aula19lab;

import java.util.Scanner;

public class Questao27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[10];
		char[] vetB = new char[10];
		
		for(int i = 0; i < vetA.length; i++) {
		
			System.out.print("Digite o valor " + i + " (vetor A): ");
			vetA[i] = scan.nextInt();
			
			if(vetA[i] < 7) vetB[i] = 'a';
			else if(vetA[i] == 7) vetB[i] = 'b';
			else vetB[i] = 'c';
			
		}
		
		for(char aux : vetB) {
			System.out.print(aux + " ");
		}
		
	}
	
}
