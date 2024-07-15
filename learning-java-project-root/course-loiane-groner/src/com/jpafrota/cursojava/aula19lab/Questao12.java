package com.jpafrota.cursojava.aula19lab;

public class Questao12 {

	public static void main(String[] args) {
		
		int[] vetA = new int[5];
		int soma = 0;
		
		for(int i = 0; i < vetA.length; i++) {
			vetA[i] = i + 1;
			soma += vetA[i];
		}
		
		System.out.println(soma);

	}
	
}
