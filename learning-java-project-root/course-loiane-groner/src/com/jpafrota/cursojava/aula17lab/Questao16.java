package com.jpafrota.cursojava.aula17lab;

public class Questao16 {

	public static void main(String[] args) {

		int soma = 1;
		int anterior = soma;
		int aux;

		System.out.println(soma);
		System.out.println(soma);
		
		while (soma < 500) {
			
			aux = anterior; 
			anterior = soma;
			soma += aux;
			System.out.println(soma);
			
		}

			
	}

}
