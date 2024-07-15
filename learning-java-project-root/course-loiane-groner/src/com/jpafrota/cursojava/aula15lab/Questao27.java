package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de morangos (em KG): ");
		double kgMorango = scan.nextDouble();
		
		System.out.println("Digite a quantidade de maçãs (em KG): ");
		double kgMaca = scan.nextDouble();
		
		double precoMorango;
		double precoMaca;
		double desconto = 0;
		
		if(kgMorango <= 5) precoMorango = 2.5 * kgMorango;
		else precoMorango = 2.2 * kgMorango;
		
		if(kgMaca <= 4) precoMaca = 1.8 * kgMaca;
		else precoMaca = 1.5 * kgMaca;
		
		double precoTotal = precoMaca + precoMorango;
		
		if((kgMorango + kgMaca) > 8 || precoTotal > 25) desconto = precoTotal * 10/100;
		
		precoTotal = precoTotal - desconto;
		
		System.out.println(kgMorango + "kg de morango: R$" + precoMorango);
		System.out.println(kgMaca + "kg de maçã: R$" + precoMaca);
		System.out.println("\nSubtotal: R$" + precoTotal);
		System.out.println("Desconto: R$" + desconto);
		System.out.println("Total: R$" + precoTotal);
		
	}
}
