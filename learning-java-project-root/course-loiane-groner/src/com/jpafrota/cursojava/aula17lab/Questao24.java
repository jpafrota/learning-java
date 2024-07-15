package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a quantidade de notas: ");
		int qtd = scan.nextInt();
		
		double nota;
		double soma = 0;
		double media;
		
		for(int i = 1; i <= qtd; i++) {
			System.out.print("Digite a " + i + "ª nota: ");
			nota = scan.nextDouble();
			soma += nota;
		}
		
		media = soma / qtd;
		
		System.out.println("A média das notas informadas é " + media);
		
	}

}
