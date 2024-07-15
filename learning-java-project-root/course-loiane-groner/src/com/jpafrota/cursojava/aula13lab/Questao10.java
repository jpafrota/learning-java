//QUESTÃO 10: Faça um Programa que peça a temperatura em graus Celsius,
//transforme e mostre em graus Farenheit.

package com.jpafrota.cursojava.aula13lab;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		double tempCelsius = scan.nextDouble();
		
		double tempFahrenheit = (9 * tempCelsius)/5 + 32;
		
		System.out.println("A temperatura em Fahrenheit é " + tempFahrenheit + " ºC");
		
	}

}
