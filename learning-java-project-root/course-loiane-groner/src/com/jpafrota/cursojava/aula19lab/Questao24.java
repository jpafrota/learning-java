package com.jpafrota.cursojava.aula19lab;

public class Questao24 {

	public static void main(String[] args) {

		int[] vetor = new int[10];
		
		boolean flag = true;
		
		// Preenchendo o vetor
		
		for(int i = 0; i < vetor.length; i++) {
			
			if(i < vetor.length/2) vetor[i] = i + 1;
			else vetor[i] = vetor.length - i;
			
			System.out.print(vetor[i]);
			
		}
		
		// Verificando se é palíndromo
		for(int i = 0; i < (vetor.length / 2) && flag == true; i++) {
			if(vetor[i] != vetor[vetor.length - (i + 1)]) flag = false;
		}
		
		System.out.print("\nÉ palíndromo: " + flag);
		
	}

}
