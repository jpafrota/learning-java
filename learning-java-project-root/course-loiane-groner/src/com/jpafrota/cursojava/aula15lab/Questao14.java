package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2)/2;
		char conceito;		
		
		if(media <= 4) {
			conceito = 'E';
		}
		else if(media <= 6) {
			conceito = 'D';
		}
		else if(media <= 7.5) {
			conceito = 'C';
		}
		else if(media <= 9) {
			conceito = 'B';
		}
		else {
			conceito = 'A';
		}
		
		switch (conceito) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("Aprovado! Sua nota é " + conceito);
			break;
		case 'D':
		case 'E':
			System.out.println("Reprovado! Sua nota é " + conceito);
			break;
		}
				
	}
}
