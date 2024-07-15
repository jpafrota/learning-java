package com.jpafrota.cursojava.aula33lab;

public class Aluno {

	private String nome;
	private int matricula;
	private String curso;
	private String[] disciplinas;
	private double[][] notas;
	
	// CONSTRUCTORS
	public Aluno() {
		this.disciplinas = new String[3];
		this.notas = new double[3][4];
	}
	
	public Aluno(String nome, int matricula, String curso) {
		this();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}
	// END OF CONSTRUCTORS
	
	// GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public double[][] getNotas() {
		return notas;
	}

	public void setNotas(double[][] notas) {
		this.notas = notas;
	}
	
	public void setDisciplinasPos(int i, String nome) {
		this.disciplinas[i] = nome;
	}
	
	public void setNotasPos(int i, int j, double nota) {
		this.notas[i][j] = nota;
	}
	// END OF GETTERS AND SETTERS
	
	// METHODS
	// METHODS
	// METHODS
	public boolean verificarAprovacao(int indice) {
		
		double soma = 0;
		for(int i = 0; i < notas[indice].length; i++) {
			soma += notas[indice][i];
		}
		
		double media = soma / notas[indice].length;
		
		if(media >= 7) return true;
		else return false;
		
	}
	
	public void mostrarInfo() {
		
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
	// END OF METHODS
}
