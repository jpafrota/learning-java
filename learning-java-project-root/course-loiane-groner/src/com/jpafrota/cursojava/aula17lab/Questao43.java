package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao43 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int codigo;
		int qtd;
		double total = 0;

		String output = "";

		do {

			System.out.print("Entre com o codigo do produto desejado: ");
			codigo = scan.nextInt();

			switch (codigo) {
			case 100:
				System.out.print("Cachorro Quente: R$1,20 | Qtd: ");
				qtd = scan.nextInt();
				output += "Cachorro Quente: R$1,20 * " + qtd + ": R$" + (qtd * 1.20) + "\n";
				total += qtd * 1.20;
				break;
			case 101:
				System.out.print("Bauru Simples: R$1,30 | Qtd: ");
				qtd = scan.nextInt();
				output += "Bauru Simples: R$1,30 * " + qtd + ": R$" + (qtd * 1.30) + "\n";
				total += qtd * 1.30;
				break;
			case 102:
				System.out.print("Bauru com Ovo: R$1,50 | Qtd: ");
				qtd = scan.nextInt();
				output += "Bauru com Ovo: R$1,50 * " + qtd + ": R$" + (qtd * 1.50) + "\n";
				total += qtd * 1.50;
				break;
			case 103:
				System.out.print("Hamburguer: R$1,20 | Qtd: ");
				qtd = scan.nextInt();
				output += "Hamburguer: R$1,20 * " + qtd + ": R$" + (qtd * 1.20) + "\n";
				total += qtd * 1.20;
				break;
			case 104:
				System.out.print("Cheeseburguer: R$1,30 | Qtd: ");
				qtd = scan.nextInt();
				output += "Cheeseburguer: R$1,30 * " + qtd + ": R$" + (qtd * 1.30) + "\n";
				total += qtd * 1.30;
				break;
			case 105:
				System.out.print("Refrigerante: R$1,00 | Qtd: ");
				qtd = scan.nextInt();
				output += "Refrigerante: R$1,00 * " + qtd + ": R$" + (qtd * 1.00) + "\n";
				total += qtd * 1.00;
				break;
			case 0:
				break;
			default:
				System.out.println("Opcao Invalida.");
			}

			System.out.println("");

		} while (codigo != 0);

		System.out.println(output.length());
		System.out.println(output);
		System.out.println("TOTAL: R$" + total);

	}

}
