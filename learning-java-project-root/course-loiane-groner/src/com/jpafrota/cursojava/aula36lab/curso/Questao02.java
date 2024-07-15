package com.jpafrota.cursojava.aula36lab.curso;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("---------UNIVERSIDADE FEDERAL DO AMAZONAS---------\n\n");
		
		Curso curso = new Curso();
		
		System.out.print("Entre com o nome do curso: ");
		curso.setNome(scan.nextLine());
		
		Professor prof = new Professor();
		
		System.out.println("DADOS DO PROFESSOR");
		System.out.print("Nome: ");
		prof.setNome(scan.nextLine());
		System.out.print("Departamento: ");
		prof.setDepartamento(scan.nextLine());
		System.out.print("Email: ");
		prof.setEmail(scan.nextLine());
		
		curso.setProfessor(prof);
		
		System.out.print("\nEntre com a quantidade de alunos: ");
		Aluno[] alunos = new Aluno[scan.nextInt()];
		scan.nextLine();
		
		for(int i = 0; i < alunos.length; i++) {
			
			Aluno a = new Aluno();
			
			System.out.println("Aluno " + (i+1) + ": ");
			System.out.print("Nome: ");
			a.setNome(scan.nextLine());
			System.out.print("Matricula: ");
			a.setMatricula(scan.nextLine());

			for(int j = 0; j < a.getNotas().length; j++) {
				
				System.out.print("Nota " + (j+1) + ": ");
				a.setNotasPos(scan.nextDouble(), j);
				scan.nextLine();
				
			}
			
			alunos[i] = a;
			
		}
		
		curso.setAlunos(alunos);
		
		if(curso != null) {
			System.out.println(curso.obterInfo());
		}
		
	}

}
