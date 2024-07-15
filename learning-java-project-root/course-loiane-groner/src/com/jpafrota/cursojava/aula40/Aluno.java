package com.jpafrota.cursojava.aula40;

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
	
	public String obterEtiquetaEndereco() {
		
		return "Endereço do Aluno: " + this.getEndereco();
		
	}
	
}
