package com.jpafrota.cursojava.aula38;

public class Aluno extends Pessoa {

	
	private String[] cursos;
	private double[] notas;
	
	public Aluno() { }
	
	public Aluno(String nome, String cpf) {
		// Tanto super quanto this nesse caso referenciam as funcoes da superclasse
		// Tanto faz qua usar.
		super.setNome(nome);
		this.setCpf(cpf);
	}
	
	public String[] getCursos() {
		return cursos;
	}
	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
}
