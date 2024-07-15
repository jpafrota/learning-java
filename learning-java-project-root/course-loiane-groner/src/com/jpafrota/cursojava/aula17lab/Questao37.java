package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao37 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int codigo;
		double altura;
		double peso;
		
		double maisBaixo = 0;
		double maisAlto = 0;
		
		double maisMagro = 0;
		double maisGordo = 0;
		
		double mediaAltura, mediaPeso;
		double somaAltura = 0, somaPeso = 0;
		
		int codMagro = 0, codGordo = 0, codAlto = 0, codBaixo = 0;
		
		int qtdAlunos = 0;
		
		do {
			
			System.out.println("-=-=-=- ALUNO " + qtdAlunos + " -=-=-=-");
			
			System.out.print("Entre com o codigo: ");
			codigo = scan.nextInt();
			
			if(codigo == 0) break;
			
			System.out.print("Entre com a altura (cm): ");
			altura = scan.nextDouble();
			
			if(somaAltura == 0) {
				maisAlto = altura;
				maisBaixo = altura;
				codAlto = codigo;
				codBaixo = codigo;
			}
			
			else if(altura > maisAlto) {
				maisAlto = altura;
				codAlto = codigo;
			}
			else if(altura < maisBaixo) {
				maisBaixo = altura;
				codBaixo = codigo;
			}
			
			somaAltura += altura;
			
			System.out.print("Entre com o peso (kg): ");
			peso = scan.nextDouble();
			
			if(somaPeso == 0) {
				maisGordo = peso;
				maisMagro = peso;
				codGordo = codigo;
				codMagro = codigo;
			}
			else if(peso > maisGordo) {
				maisGordo = peso;
				codGordo = codigo;
			}
			else if(peso < maisMagro) {
				maisMagro = peso;
				codMagro = codigo;
			}
			
			somaPeso += peso;
			
			qtdAlunos++;
			
		} while(codigo != 0);
		
		mediaAltura = somaAltura / qtdAlunos;
		mediaPeso = somaPeso / qtdAlunos;
		
		System.out.println("Mais Gordo: " + maisGordo + " kg (ID: " + codGordo + ")");
		System.out.println("Mais Magro: " + maisMagro + " kg (ID: " + codMagro + ")");
		System.out.println("Mais Alto: " + maisAlto + " cm (ID: " + codAlto + ")");
		System.out.println("Mais Baixo: " + maisBaixo + " cm (ID: " + codBaixo + ")");
		System.out.println("Média de altura dos clientes: " + mediaAltura);
		System.out.println("Média de peso dos clientes: " + mediaPeso);
		
	}

}
