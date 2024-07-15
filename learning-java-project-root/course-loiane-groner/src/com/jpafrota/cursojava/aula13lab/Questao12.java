// QUESTÃO 12: Tendo como dados de entrada a altura de uma pessoa, construa um
// algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
// (72.7*altura) - 58

package com.jpafrota.cursojava.aula13lab;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a sua altura (em metros): ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.print("O seu peso ideal é " + pesoIdeal + " kg");
		
	}

}
