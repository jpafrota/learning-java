package com.jpafrota.cursojava.aula19lab;

import java.util.Scanner;

public class Questao33 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[10];
		
		for(int i = 0; i < vetA.length; i++) {
			
			vetA[i] = scan.nextInt();
			
		}
		
		for(int aux : vetA) {
			
			boolean ehPrimo = true;
			for(int i = 2; i < aux; i++) {
				if(aux % i == 0) ehPrimo = false;
			}
			
			System.out.println(aux + ": " + ehPrimo);
			
		}
		
	}

}
