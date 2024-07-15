package com.jpafrota.cursojava.aula42;

// Classes finais não podem ser estendidas, ou seja, não podem ter subclasses

// O maior exemplo disso é a classe String.
// não se pode fazer, por exemplo: public class MinhaString EXTENDS String
// Pois é inviável e perigoso alguma classe poder sobrescrever os métodos existentes na superclasse String.
// Pode acontecer o mesmo em projetos onde temos classes extremamente sensíveis a mudanças e não desejamos que alguém altere algo.

public final class Pessoa {

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
	
	public void doSomething() {
		System.out.println("classe pessoa");
	}
	
}
