package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		int valor = scan.nextInt();
		
		int nota100;
		int nota50;
		int nota10;
		int nota5;
		int nota1;
		
		nota100 = valor / 100;
		valor = valor - nota100*100;
		
		nota50 = valor / 50;
		valor = valor - nota50*50;
		
		nota10 = valor / 10;
		valor = valor - nota10*10;
		
		nota5 = valor / 5;
		valor = valor - nota5*5;
		
		nota1 = valor;
		
		System.out.println("Notas de 100: " + nota100);
		System.out.println("Notas de 50: " + nota50);
		System.out.println("Notas de 10: " + nota10);
		System.out.println("Notas de 5: " + nota5);
		System.out.println("Notas de 1: " + nota1);
		
		
	}
}
