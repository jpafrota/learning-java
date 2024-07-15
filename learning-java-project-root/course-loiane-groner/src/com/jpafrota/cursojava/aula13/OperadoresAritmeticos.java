package com.jpafrota.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		int valor1 = 1;
		int valor2 = 2;
		
		System.out.println(valor1 + valor2);
		System.out.println(valor1 - valor2);
		System.out.println(valor1 / valor2);
		System.out.println(valor1 * valor2);
		valor1 = 7;
		valor2 = 4;
		System.out.println(valor1 % valor2);
		
		System.out.println(++valor1);
		//equivale a:
		//valor = valor + 1;
		//System.out.println(valor1);
		
		System.out.println(valor1++);
		//equivale a:
		//System.out.println(valor1);
		//valor = valor + 1;
		
		System.out.println(--valor2);
		
	}

}
