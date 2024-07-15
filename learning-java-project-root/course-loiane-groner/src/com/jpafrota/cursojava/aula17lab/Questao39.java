package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao39 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double altura;
		
		double smaller = 0, taller = 0;
		int smallerID = 0, tallerID = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.print("Digite a altura do aluno " + i + ": ");
			altura = scan.nextDouble();
			
			if(i == 1) {
				taller = altura;
				smaller = altura;
				tallerID = i;
				smallerID = i;
			}
			
			if(altura > taller) {
				taller = altura;
				tallerID = i;
			}
			
			else if(altura < smaller) {
				smaller = altura;
				smallerID = i;
			}
			
		}
		
		System.out.println("Aluno mais alto: " + taller + " (ID: " + tallerID + ")");
		System.out.println("Aluno mais baixo: " + smaller + " (ID: " + smallerID + ")");
		
	}

}