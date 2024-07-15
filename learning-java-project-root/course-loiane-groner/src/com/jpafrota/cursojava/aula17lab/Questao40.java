package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao40 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int codigo;
		int qtdVeiculos, qtdAcidentes;
		
		int maiorCidade = 0, menorCidade = 0;
		int maiorQtdAcidentes = 0, menorQtdAcidentes = 0;
		int somaVeiculos = 0, mediaVeiculos = 0;
		int somaAcidentes = 0, mediaAcidentes = 0;
		int somaPeqCidades = 0;
		
		for(int i = 1; i <= 5; i++) {
			
			System.out.println("Digite o codigo da cidade " + i + ": ");
			codigo = scan.nextInt();
			
			System.out.println("Digite o numero de veiculos em passeio: ");
			qtdVeiculos = scan.nextInt();
			
			System.out.println("Digite o numero de acidentes com vítimas: ");
			qtdAcidentes = scan.nextInt();

			if(somaAcidentes == 0) {
				maiorQtdAcidentes = qtdAcidentes;
				menorQtdAcidentes = qtdAcidentes;
				maiorCidade = codigo;
				menorCidade = codigo;
			}
			else if(qtdAcidentes > maiorQtdAcidentes) {
				maiorQtdAcidentes = qtdAcidentes;
				maiorCidade = codigo;
			}
			else if(qtdAcidentes < menorQtdAcidentes) {
				menorQtdAcidentes = qtdAcidentes;
				menorCidade = codigo;
			}
			
			somaVeiculos += qtdVeiculos;
			
			if(qtdVeiculos < 2000) {
				somaAcidentes += qtdAcidentes;
				somaPeqCidades++;
			}
			
		}
		
		mediaVeiculos = somaVeiculos / 5;
		mediaAcidentes = somaAcidentes / somaPeqCidades;
		
		System.out.println("\nEstatisticas\n");
		System.out.print("Maior índice de acidentes: " + maiorQtdAcidentes);
		System.out.println(" Cidade: " + maiorCidade);
		System.out.print("Menor índice de acidentes: " + menorQtdAcidentes);
		System.out.println(" Cidade: " + menorCidade);
		System.out.println("Média de veículos total: " + mediaVeiculos);
		System.out.println("Média de acidentes em cidades pequenas: " + mediaAcidentes);
		
	}

}