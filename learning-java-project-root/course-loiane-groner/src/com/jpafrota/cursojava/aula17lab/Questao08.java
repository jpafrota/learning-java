package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double soma = 0;
		double media;
		
		double entrada;
		
		for(int i = 0; i < 5; i++) {
			
			entrada = scan.nextDouble();
			soma += entrada;
			
		}
		
		media = soma / 5;
		
		System.out.println("A soma dos numeros é " + soma);
		System.out.println("A média dos valores é " + media);

	}

}
