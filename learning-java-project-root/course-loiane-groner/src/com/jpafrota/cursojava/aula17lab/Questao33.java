package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao33 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Entre com a quantidade de temperaturas: ");
		int qtd = scan.nextInt();
		
		double temperatura;
		double soma = 0;
		double media;
		
		for(int i = 1; i <= qtd; i++) {
			
			System.out.print("Entre com a temperatura " + i + ": ");
			temperatura = scan.nextDouble();
			soma += temperatura;
			
		}

		media = soma / qtd;
		
		System.out.println("\nA média das temperaturas é de " + media + "ºC");
		
	}

}
