package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int qtd = scan.nextInt();
		int numero = 0, maior = 0, menor = 0;
		int soma = 0;

		for (int i = 0; i < qtd; i++) {

			numero = scan.nextInt();
			
			if (soma == 0) {
				maior = numero;
				menor = numero;
			}

			if (numero > maior)
				maior = numero;
			else if (numero < menor)
				menor = numero;

			soma += numero;
		}

		System.out.println("Maior valor: " + maior);
		System.out.println("Menor valor: " + menor);
		System.out.println("Soma dos valores: " + soma);

	}

}
