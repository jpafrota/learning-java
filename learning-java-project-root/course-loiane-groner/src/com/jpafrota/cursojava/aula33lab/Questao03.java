package com.jpafrota.cursojava.aula33lab;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		aluno.setNome(scan.nextLine());
		
		System.out.println("Digite a matrícula do aluno: ");
		aluno.setMatricula(scan.nextInt());
		scan.nextLine();
		
		System.out.println("Digite o curso do aluno: ");
		aluno.setCurso(scan.nextLine());
		
		for(int i = 0; i < aluno.getDisciplinas().length; i++) {
			System.out.print("Digite a disciplina " + (i+1) + ": ");
			aluno.setDisciplinasPos(i, scan.nextLine());
			for(int j = 0; j < aluno.getNotas()[i].length; j++) {
				System.out.print("NOTA " + (j+1) + ": ");
				aluno.setNotasPos(i, j, scan.nextDouble());
				scan.nextLine();
			}
			
		}

		aluno.mostrarInfo();
	}

}
