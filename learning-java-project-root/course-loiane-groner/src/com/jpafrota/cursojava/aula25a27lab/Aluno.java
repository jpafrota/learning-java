package com.jpafrota.cursojava.aula25a27lab;

public class Aluno {

	String nome;
	int matricula;
	String curso;
	String[] disciplinas = new String[3];
	double[][] notas = new double[3][4];
	
	boolean verificarAprovacao(int indice) {
		
		double soma = 0;
		for(int i = 0; i < notas[indice].length; i++) {
			soma += notas[indice][i];
		}
		
		double media = soma / notas[indice].length;
		
		if(media >= 7) return true;
		else return false;
		
	}
	
	void mostrarInfo() {
		
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Curso: " + curso);
		
		for(int i = 0; i < disciplinas.length; i++) {
			
			System.out.println("Disciplina: " + disciplinas[i]);
			System.out.print("NOTAS: ");
			for(int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
			}
			
			if(verificarAprovacao(i)) {
				System.out.println("- APROVADO!");
			}
			else {
				System.out.println("- REPROVADO.");
			}
			
			System.out.println("");
			
		}
		
	}
	
}
