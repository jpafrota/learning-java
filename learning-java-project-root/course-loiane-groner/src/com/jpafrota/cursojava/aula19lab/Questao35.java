package com.jpafrota.cursojava.aula19lab;

import java.util.Scanner;

public class Questao35 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[10];
		
		for(int i = 0; i < vetA.length; i++) {
			
			vetA[i] = scan.nextInt();
			
		}
		
		for(int aux : vetA) {
			
			for(int i = 1; i <= aux; i++) {
				
				if(aux % i == 0) System.out.print(i + " ");
				
			}
			System.out.println("");
			
		}
		
	}

}
