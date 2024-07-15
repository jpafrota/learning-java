//QUESTÃO 07: Faça um programa que calcule a área de um quadrado, em seguida mostre
//o dobro dessa área para o usuário.

package com.jpafrota.cursojava.aula13lab;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do lado do quadrado: ");
		double lado = scan.nextDouble();
		
		double area = lado * lado;
		
		System.out.println("área do quadrado: " + area + " m²");
		System.out.println("Dobro da área: " + area*2);
		
	}
	
}
