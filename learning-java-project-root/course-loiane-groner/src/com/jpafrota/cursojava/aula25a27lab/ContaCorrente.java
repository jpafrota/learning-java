package com.jpafrota.cursojava.aula25a27lab;

public class ContaCorrente {

	int agencia;
	int conta;
	double saldo;
	double limiteEspecial;
	boolean especial;
	double limiteDisponivel;
	
	boolean sacar(double valorSaque) {
		
		double posSaque = saldo - valorSaque;

		if(posSaque < 0) {
			
			if(especial == false) {
				return false;
			}
			else if(-posSaque > limiteEspecial) {
				return false;
			}
			else {
				saldo -= valorSaque;
				limiteDisponivel = limiteEspecial + saldo;
				return true;
			}
			
		}
		
		else {
			saldo -= valorSaque;
			return true;
		}
		
	}
	
	void depositar(double valorDeposito) {
		
		saldo += valorDeposito;
		
	}
	
	void consultarSaldo() {
		System.out.println("Saldo atual: R$" + saldo);
		if(saldo < 0) System.out.println("você possui R$" + limiteDisponivel + " de limite especial");
		System.out.println("");
	}
	
	boolean consultarCheque() {
		
		return (saldo < 0);
		
	}
	
}
