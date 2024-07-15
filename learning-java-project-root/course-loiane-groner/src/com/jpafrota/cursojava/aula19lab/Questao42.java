package com.jpafrota.cursojava.aula19lab;

import java.util.Scanner;

public class Questao42 {

	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[10];
		
		for(int i = 0; i < vetA.length; i++) {
			
			vetA[i] = scan.nextInt();
			System.out.print(vetA[i] + " ");
		}
		
		System.out.println("");
		
		int aux = 0;
		int qtdProc = 0;
		for (int i = 0; i < vetA.length - 1; i++) {
				
			for(int j = i + 1 ; j < vetA.length; j++) {
				
				System.out.println("");
				
				for(int imp : vetA) {
					System.out.print(imp + " ");
				}
				
				if(vetA[i] > vetA[j]) {
					aux = vetA[j];
					vetA[j] = vetA[i];
					vetA[i] = aux;
				}
				qtdProc++;
			}
		}
		
		System.out.println("VETOR FINAL: ");
		
		for(int imp : vetA) {
			System.out.print(imp + " ");
		}
		System.out.println("\n" + qtdProc);
		
	}
}