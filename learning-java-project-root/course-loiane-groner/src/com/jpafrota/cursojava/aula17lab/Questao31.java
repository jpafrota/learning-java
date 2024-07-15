package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao31 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double preco;
		int contador = 1;
		int total = 0;
		
		double dinheiro;
		
		do {
			
			System.out.print("Produto " + contador + ": R$");
			preco = scan.nextDouble();
			total += preco;
			contador++;
			
		} while(preco != 0);
		
		System.out.println("Total: R$" + total);
		
		System.out.print("Dinheiro: R$");
		dinheiro = scan.nextDouble();
		
		System.out.println("Troco: R$" + (dinheiro - total));
		
	}

}
