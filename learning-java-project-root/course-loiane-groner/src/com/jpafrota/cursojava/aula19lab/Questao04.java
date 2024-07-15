package com.jpafrota.cursojava.aula19lab;

public class Questao04 {

	public static void main(String[] args) {
		
		int[] A = new int[15];
		
		for(int i = 0; i < A.length; i++) {
			A[i] = i+1;
		}
		
		double[] B = new double[A.length];
		
		for(int i = 0; i < B.length; i++) {
			B[i] = Math.sqrt(A[i]);
		}
		
		for(int aux : A) {
			System.out.println(aux + " ");
		}
		
		System.out.println();
		
		for(double aux : B) {
			System.out.println(aux + " ");
		}
		
	}
		
}
