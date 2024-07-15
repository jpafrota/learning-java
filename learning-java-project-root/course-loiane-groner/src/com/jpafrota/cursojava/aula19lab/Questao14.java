package com.jpafrota.cursojava.aula19lab;

public class Questao14 {

	public static void main(String[] args) {
		
		int[] vetA = new int[10];
		
		int qtd = 0;
		int soma = 0;
		double media;
		
		for(int i = 0; i < vetA.length; i++) {
				
			vetA[i] = i + 1;
			qtd++;
			soma += vetA[i];
		
		}
		
		media = (double) soma / qtd;
		
		System.out.println(media);

	}

}
