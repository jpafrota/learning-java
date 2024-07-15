package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro número: ");
		int valor1 = scan.nextInt();
		
		System.out.print("Entre com o segundo número: ");
		int valor2 = scan.nextInt();
		
		if(valor1 > valor2) {
			System.out.println("Maior: " + valor1);
		}
		else if(valor1 < valor2) {
			System.out.println("Maior: " + valor2);
		}
		else {
			System.out.println("Os dois números são iguais");
		}
		
	}

}
