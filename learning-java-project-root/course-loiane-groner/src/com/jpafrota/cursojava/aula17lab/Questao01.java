package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double nota;
		
		do {

			System.out.print("Entre com uma nota de 0 a 10: ");
			nota = scan.nextDouble();
			
			if (nota < 0 || nota > 10)
				System.out.println("Nota inválida!");
			else
				System.out.println("Nota: " + nota);

		} while (nota < 0 || nota > 10);

	}

}