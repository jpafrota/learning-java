package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro valor: ");
		double valor1 = scan.nextDouble();
		
		double maior = valor1;
		double menor = valor1;
		
		System.out.println("Entre com o segundo valor: ");
		double valor2 = scan.nextDouble();
		
		if(valor2 > maior) maior = valor2;
		else menor = valor2;
		
		System.out.println("Entre com o terceiro valor: ");
		double valor3 = scan.nextDouble();
		
		if(valor3 > maior) maior = valor3;
		else if(valor3 < menor) menor = valor3;
		
		System.out.println("O maior número digitado foi: " + maior);
		System.out.println("O menor número digitado foi: " + menor);
		
	}

}