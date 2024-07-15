package com.jpafrota.cursojava.aula43lab;

public class PessoaJuridica extends Contribuinte{

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public double calcularImposto() {
		
		if(this.getRendaBruta() <= 1400) return 0;
		if(this.getRendaBruta() <= 2100) return 0.10*this.getRendaBruta();
		if(this.getRendaBruta() <= 2800) return 0.15*this.getRendaBruta();
		if(this.getRendaBruta() <= 3600) return 0.25*this.getRendaBruta();
		else return 0.30*this.getRendaBruta();
		
	}
	
	public String toString() {
		
		String s = "PESSOA JURIDICA: [";
		s += super.toString();
		s += ", CNPJ: " + this.cnpj;
		s += ", Imposto: R$" + this.calcularImposto() + "]";
		return s;
		
	}
	
}
