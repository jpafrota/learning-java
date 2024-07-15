package com.jpafrota.cursojava.aula33lab;

public class ContaCorrente {

	private int agencia;
	private int conta;
	private double saldo;
	private double limiteEspecial;
	private boolean especial;
	private double limiteDisponivel = limiteEspecial;
	
	// Constructors
	public ContaCorrente() { }
	
	public ContaCorrente(int agencia, int conta, double saldo, double limiteEspecial, boolean especial) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.limiteEspecial = limiteEspecial;
		this.especial = especial;
		this.limiteDisponivel = limiteEspecial;
	}
	// End of Constructors
	
	// Getters and Setters
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getConta() {
		return conta;
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getLimiteEspecial() {
		return limiteEspecial;
	}
	
	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	
	public boolean isEspecial() {
		return especial;
	}
	
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	
	// END-Getters and Setters
	
	// Methods
	
	private void atualizarLimite() {
		
		limiteDisponivel = limiteEspecial + saldo;
		
	}
	
	public boolean sacar(double valorSaque) {
		
		double posSaque = saldo - valorSaque;

		if(posSaque < 0) {
			
			if(!this.isEspecial()) {
				return false;
			}
			else if(-posSaque > limiteEspecial) {
				return false;
			}
			else {
				saldo -= valorSaque;
				this.atualizarLimite();
				return true;
			}
			
		}
		
		else {
			saldo -= valorSaque;
			return true;
		}
		
	}
	
	public void depositar(double valorDeposito) {
		
		saldo += valorDeposito;
		if(saldo < 0) atualizarLimite();
		
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo atual: R$" + saldo);
		if(saldo < 0) System.out.println("você possui R$" + limiteDisponivel + " de limite especial");
		System.out.println("");
	}
	
	public boolean consultarCheque() {
		
		return (saldo < 0);
		
	}
	
}
