package com.jpafrota.cursojava.aula43lab;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;

	public ContaPoupanca() { }
	
	public ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
		super.setTipo("Poupança");
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public void calcularNovoSaldo(double taxaRendimento) {
		
		Calendar hoje = Calendar.getInstance();
		
		double saldo = this.getSaldo();
		if(this.diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			saldo += saldo * taxaRendimento;
			this.setSaldo(saldo);
		}
		
	}
	
	public String toString() {
		
		return super.toString() + "Dia Rendimento: " + this.diaRendimento + "\n";
		
	}
	
}
