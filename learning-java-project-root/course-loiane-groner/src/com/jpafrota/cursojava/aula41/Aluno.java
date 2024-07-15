package com.jpafrota.cursojava.aula41;

public class Aluno extends Pessoa {
	
	private String[] cursos;
	private double[] notas;
	
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

	public void testeAbstracao() {
		System.out.println("aluno");
	}
	
	public void funcaoQualquer() {
		System.out.println("TESTE");
	}
	
}
