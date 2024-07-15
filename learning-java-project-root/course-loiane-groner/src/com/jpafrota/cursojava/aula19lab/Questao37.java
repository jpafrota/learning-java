package com.jpafrota.cursojava.aula19lab;

import java.util.Scanner;

public class Questao37 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[10];
		int[] vetB = new int[10];
		
		for(int i = 0; i < vetA.length; i++) {
			
			vetA[i] = scan.nextInt();
			
			int fatorial = vetA[i];
			for(int j = fatorial - 1; j > 1; j--) {
				fatorial *= j;
			}
			vetB[i] = fatorial;
			
		}
		
		for(int aux : vetB) {
			System.out.print(aux + " ");
		}

	}

}
