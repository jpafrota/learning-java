package com.jpafrota.cursojava.aula19lab;

import java.util.Scanner;

public class BubbleSort {

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
			
			System.out.print("\n[" + i + "]: ");
			
			for(int j = 0; j < vetA.length - i - 1; j++) {
				
				System.out.print(j + " ");
				
				if(vetA[j] > vetA[j+1]) {
					aux = vetA[j];
					vetA[j] = vetA[j+1];
					vetA[j+1] = aux;
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