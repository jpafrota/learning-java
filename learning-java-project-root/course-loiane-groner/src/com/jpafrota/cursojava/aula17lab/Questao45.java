package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao45 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char resposta;
		String gabarito = "";
		
		int acertos = 0;
		int qtdAlunos = 0;
		int soma = 0, media;
		int maior = 0, menor = 0;
		
		int continuar;
		
		System.out.println("OLÁ PROFESSOR! Digite o gabarito da prova: ");
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.print("QUESTÃO " + i + ": ");
			gabarito += scan.next().charAt(0);
			
		}
		
		do {
			
			System.out.println("OLÁ ALUNO! Digite abaixo suas respostas.");
			
			for(int i = 1; i <= 10; i++) {
				
				System.out.print("QUESTÃO " + i + ": ");
				resposta = scan.next().charAt(0);
				
				if(resposta == gabarito.charAt(i-1)) {
					acertos++;
				}
				
			}
			
			if(qtdAlunos == 0) {
				maior = acertos;
				menor = acertos;
			}
			else if(acertos > maior) {
				maior = acertos;
			}
			else if(acertos < menor) {
				menor = acertos;
			}
			
			soma += acertos;
			qtdAlunos++;
			
			System.out.println("Acertos: " + acertos);
			System.out.println("Outro aluno irá utilizar a plataforma?");
			System.out.println("1 - Sim\n2 - não");
			continuar = scan.nextInt();
			
			acertos = 0;
			
		} while(continuar == 1);
		
		media = soma / qtdAlunos;
		
		System.out.println("Total de alunos: " + qtdAlunos);
		System.out.println("Média de notas da turma: " + media);
		System.out.println("Maior nota da turma: " + maior);
		System.out.println("Menor nota da turma: " + menor);
		
	}

}
