package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero = scan.nextInt();
		int resultado = numero;		
		
		for(int i = numero-1; i > 0; i--) {
			
			resultado = resultado * i;
			
		}
		
		if(numero == 0) resultado = 1;
		
		System.out.println("Fatorial de " + numero + ": " + resultado);
		
	}

}
