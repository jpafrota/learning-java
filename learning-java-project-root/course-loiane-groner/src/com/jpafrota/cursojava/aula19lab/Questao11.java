package com.jpafrota.cursojava.aula19lab;

public class Questao11 {

	public static void main(String[] args) {
		
		int[] vetA = new int[12];
		int qtdPares = 0;
		
		for(int i = 0; i < vetA.length; i++) {
			vetA[i] = i + 1;
			if(vetA[i] % 2 == 0) qtdPares++;
		}
		
		System.out.println(qtdPares);

	}
}
