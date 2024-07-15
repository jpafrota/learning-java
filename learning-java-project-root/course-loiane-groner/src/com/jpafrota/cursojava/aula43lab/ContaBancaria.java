package com.jpafrota.cursojava.aula43lab;

public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;
	private String tipo = "Simples";
	
	// Constructors
	public ContaBancaria() { }
	
	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	// Getters and Setters
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	// Methods
	public boolean sacar(double saque) {
		
		if(saque <= saldo) {
			saldo -= saque;
			return true;
		}
		
		return false;
		
	}
	
	public void depositar(double deposito) {
		
		this.saldo += deposito;
		
	}
	
	public void mostrarSaldo() {
		System.out.println("Saldo: R$" + this.getSaldo());
		
	}
	
	public String toString() {
		
		String s = "Tipo: " + this.tipo + "\n";
		s += "Nome: " + this.nomeCliente + "\n";
		s += "Numero: " + this.numConta + "\n";
		s += "Saldo: " + this.saldo + "\n";
		
		return s;
		
	}
	
}
