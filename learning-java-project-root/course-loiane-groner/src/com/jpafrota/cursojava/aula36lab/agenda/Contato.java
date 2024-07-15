package com.jpafrota.cursojava.aula36lab.agenda;

public class Contato {

	private String nome;
	private String telefone;
	private String email;
	
	public Contato() { }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String obterInfo() {
		
		return "Nome: " + this.nome + "\n" + 
				"Email: " + this.email + "\n" +
				"Telefone: " + this.telefone + "\n";
		
	}
	
	
}
