package com.jpafrota.cursojava.aula19lab;

public class Questao16 {

	public static void main(String[] args) {

		int[] vetA = new int[15];
		
		int somaMenor15 = 0;
		int qtdIgual15 = 0;
		int somaMaior15 = 0;
		int qtdMaior15 = 0;
		double mediaMaior15 = 0;
		
		for(int i = 0; i < vetA.length; i++) {
			
			vetA[i] = i + 5;
			
			if(vetA[i] < 15) {
				somaMenor15 += vetA[i];
			}
			else if(vetA[i] > 15) {
				somaMaior15 += vetA[i];
				qtdMaior15++;
			}
			else {
				qtdIgual15++;
			}
			
		}
		
		mediaMaior15 = somaMaior15 / qtdMaior15;

		System.out.println("Soma menores que 15: " + somaMenor15);
		System.out.println("Quantidade de elementos iguais a 15: " + qtdIgual15);
		System.out.println("Media de valores maiores que 15: " + mediaMaior15);
		
	}

}
