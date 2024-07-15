package com.jpafrota.cursojava.aula43lab;

public class Questao01 {

	public static void realizarSaque(ContaBancaria conta, double valor) {
		
		if(conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso.");
			System.out.println("Valor do saque: R$" + valor);
			
		} else {
			System.out.println("Saque não realizado. Saldo Insuficiente.");
			System.out.println("Tentativa de saque: R$" + valor);
		}
		conta.mostrarSaldo();
		System.out.println();
	}
	
	public static void main(String[] args) {

		ContaBancaria contaSimples = new ContaBancaria("Serafina", "77828", 1200);
		ContaEspecial contaEspecial = new ContaEspecial("Jorge", "466220", 1500, 500);
		ContaPoupanca contaPoupanca = new ContaPoupanca("Maycon", "713987", 200, 25);
		
		// Imprimindo as informações das contas.
		System.out.println(contaSimples.toString());
		System.out.println(contaPoupanca.toString());
		System.out.println(contaEspecial.toString());
		
		// Realizando saque.
		realizarSaque(contaEspecial, 1600);
		realizarSaque(contaEspecial, 200);
		realizarSaque(contaEspecial, 300);
		
	}
}
