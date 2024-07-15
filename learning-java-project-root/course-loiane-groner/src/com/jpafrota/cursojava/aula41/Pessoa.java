package com.jpafrota.cursojava.aula41;

// Classes abstratas não podem ser instanciadas.
public abstract class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String obterEtiquetaEndereco() {
		
		return "Endereço: " + this.endereco;
		
	}
	
	// Métodos abstratos DEVEM ser sobrescritos individualmente para cada subclasse que herda esta classe.
	public abstract void testeAbstracao();
	
	public void doSomething() {
		System.out.println("classe pessoa");
	}
	
}
