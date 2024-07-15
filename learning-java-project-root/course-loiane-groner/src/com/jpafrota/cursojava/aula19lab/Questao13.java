package com.jpafrota.cursojava.aula19lab;

public class Questao13 {

	public static void main(String[] args) {
		
		int[] vetA = new int[15];
		int somaMult5 = 0;
		
		for(int i = 0; i < vetA.length; i++) {
			
			vetA[i] = i + 1;
			if(vetA[i] % 5 == 0) somaMult5 += vetA[i];
			
		}
		
		System.out.println(somaMult5);

	}

}
