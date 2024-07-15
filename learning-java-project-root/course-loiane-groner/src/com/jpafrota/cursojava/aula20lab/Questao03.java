package com.jpafrota.cursojava.aula20lab;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int [][] vetor = new int[3][3];
		
		int qtdPares = 0;
		int qtdImpares = 0;
		for(int i = 0; i < vetor.length; i++) {
			
			for(int j = 0; j < vetor[i].length; j++) {
	
					vetor[i][j] = scan.nextInt();
					
					System.out.print(vetor[i][j] + " ");
					
					if(vetor[i][j] % 2 == 0) qtdPares++;
					else qtdImpares++;
					
			}
			System.out.println("");
		}
		
		System.out.println(qtdPares);
		System.out.println(qtdImpares);
		
	}

}
