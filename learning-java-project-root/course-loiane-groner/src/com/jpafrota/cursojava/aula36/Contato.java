package com.jpafrota.cursojava.aula36;

public class Contato {

	private String nome;
	private Endereco endereco;
	
	// na vida real nao sao utilizados arrays p representar grupos de objetos
	// e sim collections.
	private Telefone[] telefones;
	
	// Construtores
	public Contato() { }
	
	// END OF Construtores
	
	// Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
	
	// END OF Getters and Setters
	
	
	
}
