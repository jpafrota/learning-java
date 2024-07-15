package com.jpafrota.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.println("Valor atual: " + i);
		}

		System.out.println("FOR com duas variáveis");

		for (int i = 0, j = 10; i <= 10 && j >= 0; i++, j--) {

			System.out.println("i: " + i + " | j: " + j);

		}

	}

}
