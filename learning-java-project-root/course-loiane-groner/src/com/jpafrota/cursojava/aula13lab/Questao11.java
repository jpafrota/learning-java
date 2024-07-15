//QUESTÃO 11: Faça um Programa que peça 2 números inteiros e um número real.
//Calcule e mostre:
//a. o produto do dobro do primeiro com metade do segundo .
//b. a soma do triplo do primeiro com o terceiro.
//c. o terceiro elevado ao cubo.

package com.jpafrota.cursojava.aula13lab;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro: ");
		int valor1 = scan.nextInt();
		
		System.out.print("Digite outro valor inteiro: ");
		int valor2 = scan.nextInt();
		
		System.out.print("Digite um número real: ");
		double valor3 = scan.nextDouble();
		
		System.out.println("a: " + ( (valor1 * 2) * (valor2 / 2) ) );
		System.out.println("b: " + ( (valor1 * 3) + valor3 ) );
		System.out.println("c: " + Math.pow(valor3, 3) );
		
	}
}
