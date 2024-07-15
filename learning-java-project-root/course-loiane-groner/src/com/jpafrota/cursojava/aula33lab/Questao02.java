package com.jpafrota.cursojava.aula33lab;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		ContaCorrente conta = new ContaCorrente(3728, 466220, 1000, 500, true);
		
		int op;
		do {
			
			System.out.println("Digite a opcao desejada: ");
			System.out.println("0 - Sair");
			System.out.println("1 - Consultar Saldo");
			System.out.println("2 - Sacar");
			System.out.println("3 - Depositar");
			System.out.println("4 - Verificar Cheque Especial");
			op = scan.nextInt();
			
			switch(op) {
			case 1:
				conta.consultarSaldo();
				break;
			case 2: 
				System.out.print("Digite o valor a sacar: R$");
				double valorSaque = scan.nextDouble();
				boolean saqueEfetuado = conta.sacar(valorSaque);
				
				if(saqueEfetuado == true) {
					System.out.println("\nSaque efetuado com sucesso.");
					conta.consultarSaldo();
				}
				else {
					System.out.println("\nSaque não realizado. Saldo insuficiente.\n");
				}
				break;
				
			case 3: 
				System.out.print("Digite o valor a depositar: R$");
				double valorDeposito = scan.nextDouble();
				conta.depositar(valorDeposito);
				System.out.println("\nDepósito efetuado com sucesso!");
				conta.consultarSaldo();
				break;
			case 4: 
				if(conta.consultarCheque()) {
					System.out.println("\nvocê está utilizando cheque especial.");
					conta.consultarSaldo();
				}
				else {
					System.out.println("\nvocê não está utilizando cheque especial.");
					conta.consultarSaldo();
				}
				break;
			case 0:
				break;
			default:
				System.out.println("\nOpção inválida. Tente novamente.\n");
				break;
			}
			
		} while(op != 0);
		
	}

}
