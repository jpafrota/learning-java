//QUESTãO 03: Faça um programa que peça dois números e imprima
//a soma.

package com.jpafrota.cursojava.aula13lab;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int valor1 = scan.nextInt();
		System.out.print("Digite o segundo valor: ");
		int valor2 = scan.nextInt();
		System.out.println("A soma dos dois valores é: " + (valor1 + valor2));
	}

}
