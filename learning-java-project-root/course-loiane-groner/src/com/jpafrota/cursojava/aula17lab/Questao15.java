package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int anterior = 0;
		int soma = 1;
		int aux;

		for (int i = 0; i < n; i++) {
			
			System.out.print(anterior + " ");
			aux = anterior;
			anterior = soma;
			soma += aux;
			
		}

	}

}
