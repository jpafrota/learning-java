package com.jpafrota.cursojava.aula36lab.agenda;

public class Agenda {

	private String nome;
	private Contato[] contatos;
	
	public Agenda() { }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	
	public String obterInfo() {
		
		String info = "NOME: " + this.nome + "\n\n";
		
		if (this.contatos != null) {
			for (Contato c : this.contatos) {

				info += c.obterInfo() + "\n";

			}
		}
		
		return info;
	}
	
}
