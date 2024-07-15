package com.jpafrota.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {

		int i = 1;
		int max = 10;
				
		System.out.println("Contando até: " + max);

		do {
			System.out.println("Valor atual: " + i);
			i++;
		}while(i <= max);
		
	}

}
