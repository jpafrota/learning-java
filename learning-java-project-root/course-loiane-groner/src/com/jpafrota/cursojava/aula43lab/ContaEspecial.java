package com.jpafrota.cursojava.aula43lab;

public class ContaEspecial extends ContaBancaria {

	private double limite;
	private double limiteDisponivel;
	
	// Constructors
	public ContaEspecial() { }
	
	public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
		this.limiteDisponivel = limite;
		super.setTipo("Especial");
	}
	
	// Getters and Setters
	public double getLimite() {
		return this.limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	// Methods
	public boolean sacar(double saque) {
		
		if(saque <= this.getSaldo()) {
			super.sacar(saque);
			return true;
		}
		else if(Math.abs(this.getSaldo() - saque) <=  limiteDisponivel){
			double saldo = this.getSaldo();
			saldo -= saque;
			this.setSaldo(saldo);
			atualizarLimite();
			return true;
		}
		
		return false;
		
	}
	
	public void depositar(double deposito) {
		super.depositar(deposito);
		atualizarLimite();
	}
	
	public void mostrarSaldo() {
		
		super.mostrarSaldo();
		System.out.println("Limite Disponível: R$" + this.limiteDisponivel);
		
	}
	
	private void atualizarLimite() {
		
		if(this.getSaldo() < 0) {
			limiteDisponivel = limite + this.getSaldo();
		}
		
	}
	
	public String toString() {
		
		return super.toString() + "Limite: " + this.limite + "\n";
		
	}
	
}
