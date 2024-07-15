package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao51 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		double soma = 0;
		
		System.out.print("S = ");
		
		for(double i = 1, j = 1; i <= n; i++, j+=2) {

			System.out.print((int) i + "\\" + (int) j);
			if(i < n) System.out.print(" + ");
			soma += i / j;
			
		}

		System.out.println("\n\nSoma: " + soma);

	}

}
