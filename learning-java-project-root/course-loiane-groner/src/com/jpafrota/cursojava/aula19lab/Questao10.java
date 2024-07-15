package com.jpafrota.cursojava.aula19lab;

public class Questao10 {

	public static void main(String[] args) {
		
		int[] vetA = new int[10];
		
		for(int i = 0; i < vetA.length; i++) {
			vetA[i] = i + 1;
		}
		
		double[] vetB = new double[vetA.length];
		
		for(int i = 0; i < vetB.length; i++) {
			vetB[i] = vetA[i] % 2;
		}
		
		System.out.println();
		
		for(double aux : vetB) {
			System.out.println(aux);
		}
		
	}

}
