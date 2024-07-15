package com.jpafrota.cursojava.aula47;

public class Excecao {

	public static void main(String[] args) {


		try {

			int[] vetor = new int[4];
			
			System.out.println("Antes da exception");
			
			vetor[4] = 3;
			
			System.out.println("Depois da exception" + vetor[4]);
			
		} 
		catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("Erro ao tentar acessar indice fora do intervalo.");
		}
		System.out.println("Texto pós-exceptions.");
		
	}

}
