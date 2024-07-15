package com.jpafrota.cursojava.aula19lab;

import java.util.Scanner;

public class Questao32 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[5];
		
		for(int i = 0; i < vetA.length; i++) {
			
			vetA[i] = scan.nextInt();
			
		}
		
		for(int i = 0; i < vetA.length; i++) {
			
			for(int j = 1; j <= 10; j++){
				int resultado = vetA[i] * j;
				System.out.print(vetA[i] + " x " + j + " = " + resultado);
				System.out.println("");
			}
			
			System.out.println("");
		}
		
	}

}
