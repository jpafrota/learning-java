package com.jpafrota.cursojava.aula19lab;

import java.util.Scanner;

public class Questao19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double[] nota1, nota2, result;
		
		nota1 = new double[10];
		nota2 = new double[10];
		result = new double[10];
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("ALUNO " + (i+1));
			
			System.out.print("Digite a nota 1: ");
			nota1[i] = scan.nextDouble();
			
			System.out.print("Digite a nota 2: ");
			nota2[i] = scan.nextDouble();
		
			result[i] = (nota1[i] + nota2[i])/2;
			
		}
		
		for(double aux : result) {
			System.out.println(aux);
		}
		
	}

}
