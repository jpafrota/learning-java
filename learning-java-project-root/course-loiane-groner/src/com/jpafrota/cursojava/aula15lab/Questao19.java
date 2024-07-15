package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		int valor = scan.nextInt();
		
		int centenas = valor / 100;
		int dezenas = (valor - centenas * 100) / 10;
		int unidades = (valor - (centenas * 100 + dezenas * 10)); 
		
		System.out.println("Centenas: " + centenas);
		System.out.println("Dezenas: " + dezenas);
		System.out.println("Unidades: " + unidades);
		
	}
}
