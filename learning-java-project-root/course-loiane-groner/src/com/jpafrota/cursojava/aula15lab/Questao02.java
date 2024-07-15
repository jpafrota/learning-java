package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com um número: ");
		int valor = scan.nextInt();
		
		if(valor > 0) {
			System.out.println("Este valor é positivo.");
		}
		else if(valor < 0) {
			System.out.println("Este valor é negativo.");
		}
		else {
			System.out.println("Zero é um valor neutro.");
		}
		
	}

}
