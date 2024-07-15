package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao36 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Tabuada de: ");
		int numero = scan.nextInt();
		
		System.out.print("Iniciar em: ");
		int inicio = scan.nextInt();
		
		System.out.print("Terminar em: ");
		int fim = scan.nextInt();
		
		for(int i = inicio; i <= fim; i++) {
			
			System.out.println(numero + " x " + i + " = " + (numero * i));
			
		}
		
		
	}

}
