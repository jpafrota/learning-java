package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao50 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		double soma = 0;
		
		System.out.print("H = ");
		
		for(double i = 1; i <= n; i++) {
			
			System.out.print(1 + "\\" + (int) i);
			if(i < n) System.out.print(" + ");
			soma += 1 / i;
			
		}
		
		System.out.println("\n\nSoma: " + soma);
		
	}

}
