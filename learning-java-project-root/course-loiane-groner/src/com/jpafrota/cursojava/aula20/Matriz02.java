package com.jpafrota.cursojava.aula20;

import java.util.Scanner;

public class Matriz02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[][] filhos;
		
		System.out.println("Entre com a quantidade de pessoas da pesquisa: ");
		int amostra = scan.nextInt();
		filhos = new String[amostra][];
		
		for(int i = 0; i < filhos.length; i++) {
			
			System.out.println("Entre com a quantidade de filhos: ");
			int qtdFilhos = scan.nextInt();
			
			filhos[i] = new String[qtdFilhos];
			
			for(int j = 0; j < filhos[i].length; j++) {
				
				System.out.println("Pessoa " + (i+1) + " | Filho " + (j+1) + ": ");
				filhos[i][j] = scan.next();
				
			}
			
		}
		
		System.out.println("\nRESULTADOS DA PESQUISA: \n");
		
		for(int i = 0; i < filhos.length; i++) {
			
			for(int j = 0; j < filhos[i].length; j++) {
				System.out.print("Pessoa " + (i+1) + " | Filho " + (j+1) + ": ");
				System.out.println(filhos[i][j]);
			}
			System.out.println("");
			
		}
		
	}

}
