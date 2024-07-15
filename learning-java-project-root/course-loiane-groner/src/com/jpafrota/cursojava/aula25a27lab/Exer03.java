package com.jpafrota.cursojava.aula25a27lab;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		aluno.nome = scan.nextLine();
		
		System.out.println("Digite a matrícula do aluno: ");
		aluno.matricula = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Digite o curso do aluno: ");
		aluno.curso = scan.nextLine();
		
		for(int i = 0; i < aluno.disciplinas.length; i++) {
			System.out.print("Digite a disciplina " + (i+1) + ": ");
			aluno.disciplinas[i] = scan.nextLine();
			for(int j = 0; j < aluno.notas[i].length; j++) {
				System.out.print("NOTA " + (j+1) + ": ");
				aluno.notas[i][j] = scan.nextDouble();
				scan.nextLine();
			}
			
		}

		aluno.mostrarInfo();
		
	}

}
