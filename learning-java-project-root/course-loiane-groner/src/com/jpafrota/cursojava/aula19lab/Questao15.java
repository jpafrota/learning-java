package com.jpafrota.cursojava.aula19lab;

import java.text.DecimalFormat;

public class Questao15 {

	public static void main(String[] args) {

		int[] vetA = new int[11];
		
		int qtdPares = 0, qtdImpares = 0;
		
		for(int i = 0; i < vetA.length; i++) {
			
			vetA[i] = i + 1;
			
			if(vetA[i] % 2 == 0) qtdPares++;
			else qtdImpares++;
			
		}
		
		double percentPares = (double) (qtdPares * 100) / vetA.length;
		double percentImpares = (double) (qtdImpares * 100) / vetA.length;
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		System.out.println(df.format(percentPares) + "%");
		System.out.println(df.format(percentImpares) + "%");
	}

}
