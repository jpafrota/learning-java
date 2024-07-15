package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao44 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int voto;

		int somaBolsonaro = 0;
		int somaLula = 0;
		int somaCiro = 0;
		int somaLoiane = 0;
		int somaNulos = 0;
		int somaBrancos = 0;

		System.out.println("-=-=- TRE Amazonas -=-=-");
		System.out.println("Tabela de Votação");
		System.out.println("\n1 - Bolsonaro\n2 - Lula\n3 - Ciro Gomes\n4 - Loiane Groner");
		System.out.println("5 - Voto nulo\n6 - Voto em branco\n0 - Finalizar Votação");

		do {
			
			voto = scan.nextInt();

			switch (voto) {
			case 1:
				somaBolsonaro++;
				break;
			case 2:
				somaLula++;
				break;
			case 3:
				somaCiro++;
				break;
			case 4:
				somaLoiane++;
				break;
			case 5:
				somaNulos++;
				break;
			case 6:
				somaBrancos++;
				break;
			case 0:
				break;
			default:
				System.out.println("Opcao invalida.");
			}

		} while (voto != 0);

		System.out.println("Contagem de votos: ");
		System.out.println("Bolsonaro: " + somaBolsonaro);
		System.out.println("Lula: " + somaLula);
		System.out.println("Ciro: " + somaCiro);
		System.out.println("Loiane: " + somaLoiane);
		System.out.println("Nulos: " + somaNulos);
		System.out.println("Brancos: " + somaBrancos);

	}

}
