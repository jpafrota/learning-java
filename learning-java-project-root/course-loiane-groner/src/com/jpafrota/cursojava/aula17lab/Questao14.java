package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int qtdPares = 0;
		int qtdImpares = 0;
		
		int numero;
		
		for(int i = 0; i < 10; i++) {
			
			numero = scan.nextInt();
			
			if(numero % 2 == 0) qtdPares++;
			else qtdImpares++;
			
		}
		
		System.out.println("Quantidade de numeros pares: " + qtdPares);
		System.out.println("Quantidade de numeros impares: " + qtdImpares);
		
	}

}
