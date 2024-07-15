package com.jpafrota.cursojava.aula19lab;

public class Questao22 {

	public static void main(String[] args) {

		int[] vetA = new int[10];
		
		int qtdZeros = 0, qtdUns = 0;
		
		for(int i = 0; i < vetA.length; i++) {
			
			vetA[i] = (int) Math.round(Math.random() * 1);
			
			if(vetA[i] == 0) {
				qtdZeros++;
			}
			else if(vetA[i] == 1) {
				qtdUns++;
			}
			
			System.out.print(vetA[i] + " ");
			
		}
		
		System.out.println("\nQuantidade de zeros: " + qtdZeros);
		System.out.println("Quantidade de uns: " + qtdUns);
		
		
	}

}
