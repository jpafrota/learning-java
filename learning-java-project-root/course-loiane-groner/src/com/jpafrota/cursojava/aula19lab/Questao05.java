package com.jpafrota.cursojava.aula19lab;

public class Questao05 {

	public static void main(String[] args) {
		
		int[] A = new int[15];
		
		for(int i = 0; i < A.length; i++) {
			A[i] = i+1;
		}
		
		int[] B = new int[A.length];
		
		for(int i = 0; i < B.length; i++) {
			B[i] = A[i] * i;
		}
		
		for(int aux : A) {
			System.out.println(aux + " ");
		}
		
		System.out.println();
		
		for(int aux : B) {
			System.out.println(aux + " ");
		}
		
	}

}
