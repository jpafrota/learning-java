package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("número par!");
		}
		else {
			System.out.println("número ímpar!");
		}
		
	}
}
