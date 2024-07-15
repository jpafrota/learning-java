package com.jpafrota.cursojava.aula20;

public class Matriz {

	public static void main(String[] args) {

		int [][][] vetor = new int[3][3][3];
		
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		for(int i = 0; i < vetor.length; i++) {
			
			for(int j = 0; j < vetor[i].length; j++) {
				
				for(int k = 0; k < vetor[i][j].length; k++) {
					
					vetor[i][j][k] = i + j + k;
					
					System.out.print(vetor[i][j][k] + " ");
					
					soma += vetor[i][j][k];
					
					if(vetor[i][j][k] % 2 == 0) somaPares += vetor[i][j][k];
					else somaImpares += vetor[i][j][k];
					
				}
				System.out.println("");
				
			}
			System.out.println("");
		}
		
		System.out.println(soma);
		System.out.println(somaPares);
		System.out.println(somaImpares);
		
	}

}
