package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao28 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a quantidade de CDs: ");
		int quantidadeCDs = scan.nextInt();
		int valorCD;
		double soma = 0, media;
		
		for(int i = 1; i <= quantidadeCDs; i++) {
			
			System.out.println("Digite o valor do CD " + i + ": ");
			valorCD = scan.nextInt();
			
			soma += valorCD;
			
		}
		
		media = soma / quantidadeCDs;
		
		System.out.println("você investiu um total de: R$" + soma);
		System.out.println("Com uma média de R$" + media + " por CD");
		
	}

}
