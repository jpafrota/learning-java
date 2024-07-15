package com.jpafrota.cursojava.aula17lab;

public class Questao04 {

	public static void main(String[] args) {

		int a = 80000;
		int b = 200000;
		
		int anos = 0;
		
		while(a < b) {
			
			a += (a/100)*3;
			b += (int) ((b/100)*1.5);
			anos++;
			
		}
		
		System.out.println("Anos passados: " + anos);
		System.out.println("Valor da população da cidade A: " + a);
		System.out.println("Valor da população da cidade B: " + b);

	}

}