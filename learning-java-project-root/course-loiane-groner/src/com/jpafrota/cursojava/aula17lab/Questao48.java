package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao48 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		String numero = scan.next();
		
		String resultado = "";
		
		for(int i = numero.length()-1; i >= 0; i--) {

			resultado += numero.charAt(i);
			
		}
		
		System.out.println("Resultado: " + resultado);
		
		
	}

}
