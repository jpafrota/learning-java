package com.jpafrota.cursojava.aula42;

public class Professor{

	private String departamento;
	private String nomeCurso;
	private double Salario;
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	
	public String doAnything() {
		return "classe professor";
	}
	
	public void testeAbstracao() {
		System.out.println("professors");
	}
	
}
