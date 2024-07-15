package com.jpafrota.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		/*
		 * int idade = scan.nextInt();
		 * 
		 * if(idade >= 18) { System.out.println("Você é maior de idade!"); }
		 * 
		 * else { System.out.println("Você é menor de idade. :("); }
		 * 
		 * barato <= 10 10 < valor <= 15 - pedir desconto 15 < valor <= 17 - pesquisar
		 * mais valor > 17 - muito caro
		 */
		
		System.out.print("Digite o preço do produto desejado: ");
		double preco = scan.nextDouble();
		
		if(preco <= 10) {
			System.out.println("O produto esta muito barato!");
		}
		
		else if(preco < 15) {
			System.out.println("Peça um desconto.");
		}
		
		else if(preco < 17) {
			System.out.println("Pesquise mais");
		}
		
		else {
			System.out.println("O produto está muito caro");
		}
		
		
	}

}
