//QUESTÃO 06: Faça um programa que peça o raio de um círculo, calcule e mostre sua área.

package com.jpafrota.cursojava.aula13lab;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio (em metros): ");
		double raio = scan.nextDouble();
		
		System.out.print("O valor da área é " + 3.14 * (raio * raio) + "m²");
		
		
	}

}
