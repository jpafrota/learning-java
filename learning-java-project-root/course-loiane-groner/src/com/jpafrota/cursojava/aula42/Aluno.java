package com.jpafrota.cursojava.aula42;

public class Aluno {
	
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
	
}
