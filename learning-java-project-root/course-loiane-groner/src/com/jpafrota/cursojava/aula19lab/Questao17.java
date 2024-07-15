package com.jpafrota.cursojava.aula19lab;

import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		int qtdMaior35 = 0;
		
		for(int i = 1; i <= idades.length; i++) {
			
			System.out.print("Digite a idade da pessoa " + i + ": ");
			idades[i-1] = scan.nextInt();
			if(idades[i-1] > 35) qtdMaior35++;
			
		}
		
		System.out.println("Pessoas maiores de 35 anos: " + qtdMaior35);
		
	}

}
