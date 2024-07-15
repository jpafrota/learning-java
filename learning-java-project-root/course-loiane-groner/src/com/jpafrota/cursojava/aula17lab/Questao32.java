package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao32 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero = scan.nextInt();
		int resultado = numero;		
		
		System.out.print(numero + "! = " + numero);
		
		for(int i = numero-1; i > 0; i--) {
			
			resultado = resultado * i;
			System.out.print(" . " + i);
			
		}
		
		if(numero == 0) resultado = 1;
		
		System.out.println(" = " + resultado);
		
	}

}
