package com.jpafrota.cursojava.aula19lab;

public class Questao23 {

	public static void main(String[] args) {

		int[] vetA = new int[10];
		
		boolean flag = true;
		
		// Preencher o vetor
		for(int i = 0; i < vetA.length; i++) {
			
			vetA[i] = (i+1)*2;
			
		}
		
		// Verificação
		for(int aux : vetA) {
			
			System.out.print(aux + " ");
			if(aux % 2 != 0) flag = false;
				
		}
		
		System.out.print("\nTodos os números são pares: " + flag);
		
		
		
	}

}
