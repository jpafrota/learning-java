package com.jpafrota.cursojava.aula19lab;

import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		int maior = 0, menor = 0;
		
		for(int i = 0; i < idades.length; i++) {
			
			System.out.print("Digite a idade da pessoa " + (i+1) + ": ");
			idades[i] = scan.nextInt();
			
			
			if(i == 0) {
				maior = menor = idades[i];
			}
			else if(idades[i] > maior) {
				maior = idades[i];
			}
			else if(idades[i] < menor) {
				menor = idades[i];
			}
			
		}
		
		System.out.println("Maior idade: " + maior);
		System.out.println("Menor idade: " + menor);
		
	}

}
