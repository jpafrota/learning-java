package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String sexo = scan.next();
		
		// esse exercício poderia ser resolvido usando leitura de Char
		//
		// char sexo = scan.next().charAt(0);
		
		if(sexo.equalsIgnoreCase("F")) {
			System.out.println("Sexo digitado: Feminino");
		}
		else if(sexo.equalsIgnoreCase("M")){
			System.out.println("Sexo digitado: Masculino");
		}
		else {
			System.out.println("Sexo inválido.");
		}
		
	}
}
