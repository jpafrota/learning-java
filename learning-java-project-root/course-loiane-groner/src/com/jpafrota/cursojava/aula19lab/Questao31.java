package com.jpafrota.cursojava.aula19lab;

public class Questao31 {

	public static void main(String[] args) {

		int[] vetA = new int[20];
		int[] vetB = new int[20];
		
		int posB = 0;
		for(int i = 0; i < vetA.length; i++) {
			
			vetA[i] = i;
			if(vetA[i] % 2 == 0) {
				vetB[posB] = vetA[i];
				posB++;
			}
		}
		
		for(int i = 0; i < vetA.length; i++) {
			if(vetA[i] % 2 != 0) {
				vetB[posB] = vetA[i];
				posB++;
			}
		}
		
		for(int aux : vetB) {
			System.out.print(aux + " ");
		}
		
		
		
	}

}
