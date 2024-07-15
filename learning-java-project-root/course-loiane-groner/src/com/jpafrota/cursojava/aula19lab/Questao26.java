package com.jpafrota.cursojava.aula19lab;

public class Questao26 {

	public static void main(String[] args) {

		int[] vetA = new int[10];
		int[] vetB = new int[10];
		int[] vetC = new int[10];
		
		for(int i = 0; i < vetA.length; i++) {
			vetA[i] = i + 1;
			vetB[i] = 10 - i;
			System.out.println(vetA[i] + " " + vetB[i]);
		}
		
		for(int i = 0; i < vetC.length; i++) {
			
			if(vetA[i] > vetB[i]) vetC[i] = 1;
			else if(vetA[i] == vetB[i]) vetC[i] = 0;
			else vetC[i] = -1;
			
		}
		
		for(int aux : vetC) {
			System.out.print(aux + " ");
		}
		
	}

}
