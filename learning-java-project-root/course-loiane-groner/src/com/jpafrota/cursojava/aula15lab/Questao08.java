package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o preço do primeiro produto: ");
		double produto1 = scan.nextDouble();
		
		System.out.print("Digite o preço do segundo produto: ");
		double produto2 = scan.nextDouble();
		
		System.out.print("Digite o preço do terceiro produto: ");
		double produto3 = scan.nextDouble();
		
		if(produto1 <= produto2 && produto1 <= produto3) {
			System.out.println("Compre o produto 1 no valor de: " + produto1);
		} else if(produto2 <= produto1 && produto2 <= produto3) {
			System.out.println("Compre o produto 2 no valor de: " + produto2);
		} else {
			System.out.println("Compre o produto 3 no valor de: " + produto3);
		}
				
	}
}
