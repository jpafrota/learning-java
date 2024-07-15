package com.jpafrota.cursojava.aula19lab;

public class Questao03 {

	public static void main(String[] args) {
		
		int[] A = new int[8];
		
		for(int i = 0; i < 8; i++) {
			A[i] = i+1;
		}
		
		int[] B = new int[8];
		
		for(int i = 0; i < 8; i++) {
			B[i] = A[i] * A[i];
		}
		
		for(int aux : A) {
			System.out.print(aux + " ");
		}
		
		System.out.println();
		
		for(int aux : B) {
			System.out.print(aux + " ");
		}

	
	}
}
