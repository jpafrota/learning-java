package com.jpafrota.cursojava.aula17lab;

public class Questao30 {

	public static void main(String[] args) {

		System.out.println("Padaria Pão de Ontem - Tabela de preços");
		System.out.println("preço do pão: R$0.18");
		
		for(int i = 1; i <= 50; i++) {
			System.out.println(i + ": R$" + i*0.18);
		}

	}

}
