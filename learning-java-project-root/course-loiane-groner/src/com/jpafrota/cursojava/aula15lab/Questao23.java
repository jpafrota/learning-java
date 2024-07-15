package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com um valor: ");
		double valor = scan.nextDouble();
		
		if((valor * 10) % 10 == 0) System.out.println("número inteiro!");
		else System.out.println("número decimal!");
		
	}
}
