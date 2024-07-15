package com.jpafrota.cursojava.aula19lab;

import java.util.Scanner;

public class Questao28 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[10];
		int[] vetB = new int[10];
		
		for(int i = 0; i < vetA.length; i++) {
			
			System.out.print("Digite o valor " + i + ": ");
			vetA[i] = scan.nextInt();
			
			vetB[(vetB.length - 1) - i] = vetA[i];
			
		}
		
		for(int aux : vetB) {
			System.out.print(aux + " ");
		}
		
	}

}
