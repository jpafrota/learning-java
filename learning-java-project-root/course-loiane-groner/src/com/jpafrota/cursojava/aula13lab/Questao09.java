//QUESTÃO 09: Faça um Programa que peça a temperatura em graus Farenheit,
//transforme e mostre a temperatura em graus Celsius.

package com.jpafrota.cursojava.aula13lab;

import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		double tempFahrenheit = scan.nextDouble();
		
		double tempCelsius = (5 * (tempFahrenheit - 32) / 9);
		
		System.out.println("A temperatura em Celsius é " + tempCelsius + " ºC");
		
	}

}
