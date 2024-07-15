package com.jpafrota.cursojava.aula36lab.curso;

public class Curso {

	private String nome;
	private Professor professor;
	private Aluno[] alunos;

	public Curso() { 
		this.professor = new Professor();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public String obterInfo() {
		
		String info = "Curso: " + this.nome + "\n";
		
		info += "\nProfessor: \n";
		info += this.professor.obterInfo() + "\n\n";
		
		info += "\nAlunos \n\n";
		
		int cont = 1;
		for(Aluno aux : this.alunos) {
			info += "Aluno " + cont + "\n";
			info += aux.obterInfo() + "\n\n";
			cont++;
		}
		
		return info;
		
	}
	
}
