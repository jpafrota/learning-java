//QUESTÃO 05: Faça um programa que converta metros para centímetros

package com.jpafrota.cursojava.aula13lab;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com a medida em metros: ");
		double metros = scan.nextDouble();
		
		System.out.println("A medida em centímetros é: " + (metros * 100) + "cm");
	}

}
