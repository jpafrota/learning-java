package com.jpafrota.cursojava.aula19lab;

import java.util.Scanner;

public class Questao29 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[10];
		int[] vetB = new int[10];
		int[] vetC = new int[vetA.length + vetB.length];
		
		for(int i = 0; i < vetA.length && i < vetB.length; i++) {
			
			System.out.print("[" + i + "] A: ");
			vetA[i] = scan.nextInt();
			vetC[i] = vetA[i];
			
			System.out.print("[" + i + "] B: ");
			vetB[i] = scan.nextInt();
			vetC[i + vetC.length/2] = vetB[i];
		}
		
		for(int aux : vetC) {
			
			System.out.print(aux + " ");
			
		}
		
	}

}
