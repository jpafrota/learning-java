package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao27 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int qtdTurmas;
		int qtdAlunos;

		double media;
		int soma = 0;

		do {

			System.out.println("Digite a quantidade de turmas: ");
			qtdTurmas = scan.nextInt();

			if (qtdTurmas > 40)
				System.out.println("Erro: não pode haver mais de 40 turmas.\n\n");

		} while (qtdTurmas > 40);

		for (int i = 1; i <= qtdTurmas; i++) {

			System.out.println("Digite a quantidade de alunos da turma " + i + ": ");
			qtdAlunos = scan.nextInt();
			soma += qtdAlunos;

		}

		media = soma / qtdTurmas;
		
		System.out.println("A media de alunos por turma é de: " + media);

	}

}
