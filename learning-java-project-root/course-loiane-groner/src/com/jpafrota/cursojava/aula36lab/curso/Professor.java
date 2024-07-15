package com.jpafrota.cursojava.aula36lab.curso;

public class Professor {

	private String nome;
	private String departamento;
	private String email;
	
	public Professor() { }

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String obterInfo() {
		
		return "Nome: " + this.nome + "\n" +
				"Departamento: " + this.departamento + "\n" +
				"E-mail: " + this.email;
		
	}
	
}
