package com.jpafrota.cursojava.aula43lab;

public class PessoaFisica extends Contribuinte {

	private String cpf;
	
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double calcularImposto() {
		
		return 0.1*this.getRendaBruta();
		
	}
	
	public String toString() {
		String s = "PESSOA FISICA: [";
		s += super.toString();
		s += ", CPF: " + this.cpf;
		s += ", Imposto: R$" + this.calcularImposto() + "]";
		return s;
	}
	
}
