package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com um valor: ");
		double valor = scan.nextDouble();
		
		System.out.println("Entre com a operação desejada: ");
		System.out.println("1 - Par ou ímpar");
		System.out.println("2 - Positivo ou Negativo");
		System.out.println("3 - Inteiro ou Decimal");
		int operacao = scan.nextInt();
		
		switch(operacao) {
		
		case 1: 
			if((valor * 10) % 10 == 0) {
				if(valor % 2 == 0) System.out.println("número par!");
				else System.out.println("número ímpar!");
			}
			else {
				System.out.println("ERRO! Valor não é inteiro.");
			}
			break;
		case 2: 
			if(valor >= 0) System.out.println("Valor positivo!");
			else System.out.println("Valor negativo!");
			break;
		case 3: 
			if((valor * 10) % 10 == 0) {
				System.out.println("Valor inteiro.");
			}
			else {
				System.out.println("Valor decimal.");
			}
			break;
		default:
			System.out.println("Operação inválida.");
		}
		
		
	}
}
