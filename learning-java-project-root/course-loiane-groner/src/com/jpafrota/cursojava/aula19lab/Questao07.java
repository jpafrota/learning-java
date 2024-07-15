package com.jpafrota.cursojava.aula19lab;

public class Questao07 {

	public static void main(String[] args) {
		
		int[] vetA = new int[10];
		
		for(int i = 0; i < vetA.length; i++) {
			vetA[i] = i + 10;
		}
		
		double[] vetB = new double[vetA.length];
		
		for(int i = 0; i < vetB.length; i++) {
			vetB[i] = i + 1;
		}
		
		double[] vetC = new double[vetA.length];
		
		for(int i = 0; i < vetC.length; i++) {
			vetC[i] = vetA[i] - vetB[i];
		}
		
		System.out.println();
		
		for(double aux : vetC) {
			System.out.println(aux);
		}
		
	}

}
