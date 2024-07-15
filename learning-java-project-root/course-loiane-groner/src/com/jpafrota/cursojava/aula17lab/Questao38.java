package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao38 {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		double percentual = 1.5/100;
		
		System.out.print("Digite o salario inicial: R$");
		double salario = scan.nextDouble();
		
		System.out.print("Digite o ano atual: ");
		int ano = scan.nextInt();
		
		for(int i = 1996; i <= ano; i++) {
			
			salario += percentual*salario;
			percentual *= 2;
			
		}
		
		System.out.println("Salario atual: " + salario);

	}
	
}