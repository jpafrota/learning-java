package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean flag;
		
		do { 
			
			System.out.println("Entre com seu nome: ");
			String nome = scan.next();
			if (nome.length() <= 3) {
				System.out.println("ERRO! Nome precisa ter mais de 3 caracteres.");
				flag = false;
			}
			else flag = true;
			
		} while (!flag);
				
		do {
			
			System.out.println("Entre com sua idade: ");
			int idade = scan.nextInt();
			if (idade < 0 || idade > 150) {
				System.out.println("ERRO! Idade deve estar entre 0 e 150.");
				flag = false;
			}
			else flag = true;
			
		} while (!flag);
		
		do {
			
			System.out.println("Entre com seu salário: ");
			int salario = scan.nextInt();
			if (salario < 0) {
				System.out.println("ERRO! salário não pode ser negativo.");
				flag = false;
			}
			else flag = true;
			
		} while (!flag);
		
		do {
			
			System.out.println("Entre com seu sexo: ");
			String sexo = scan.next();
			if (!sexo.equalsIgnoreCase("m") 
					&& !sexo.equalsIgnoreCase("f")) {
				System.out.println("ERRO! Sexo inválido.");
				flag = false;
			}
			else flag = true;
			
		} while (!flag);
		
		do {
			
			System.out.println("Entre com seu estado civil: ");
			String estadoCivil = scan.next();
			switch(estadoCivil) {
			case "s":
			case "c":
			case "v":
			case "d":
			case "S":
			case "C":
			case "V":
			case "D":
				flag = true;
				break;
			default:
				System.out.println("Erro! Estado civil invalido.");
				flag = false;
			} 
		
		} while (!flag);

	}
}
