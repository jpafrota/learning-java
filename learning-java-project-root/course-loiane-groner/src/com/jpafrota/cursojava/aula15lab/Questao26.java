package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o tipo de combustível desejado?");
		String tipoCombustivel = scan.next();
		
		System.out.println("Quantos litros você deseja?");
		double litros = scan.nextDouble();
		
		double valorTotal;
		double desconto;
		
		switch(tipoCombustivel) {
		case "a":
		case "A":
			
			valorTotal = 1.9 * litros;
			
			if(litros <= 20) desconto = valorTotal * 3 / 100;
			else desconto = valorTotal * 5 / 100;
						
			valorTotal = valorTotal - desconto;
			
			System.out.println("você recebeu um desconto de: R$" + desconto);
			System.out.println("O valor total a ser pago é de: R$" + valorTotal);
			break;
			
		case "g":
		case "G":
			
			valorTotal = 2.5 * litros;
			
			if(litros <= 20) desconto = valorTotal * 4 / 100;
			else desconto = valorTotal * 6 / 100;
			
			valorTotal = valorTotal - desconto;
			
			System.out.println("você recebeu um desconto de: R$" + desconto);
			System.out.println("O valor total a ser pago é de: R$" + valorTotal);
			break;
			
		default:
			System.out.println("Opção inválida.");
		}
		
	}
}
