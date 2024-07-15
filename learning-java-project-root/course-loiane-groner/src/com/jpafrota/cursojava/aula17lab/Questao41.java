package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao41 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double valorDivida;
		double valorJuros, porcentJuros = 10;
		double valorParcela;

		System.out.println("Entre com o valor da dívida: ");
		valorDivida = scan.nextDouble();
		
		System.out.println("\n\nDivida: R$" + valorDivida);
		System.out.println("Qtd Parcelas: 1");
		System.out.println("Valor Juros (%0): R$0.0");
		System.out.println("Valor Parcela: R$" + valorDivida);
		
		for(int i = 3; i <= 12; i += 3) {
			
			valorJuros = porcentJuros * (valorDivida/100d);
			valorParcela = (valorDivida + valorJuros) / i;

			System.out.println("\n\nDivida: R$" + (valorDivida + valorJuros) );
			System.out.println("Qtd Parcelas: " + i);
			System.out.println("Valor Juros (%" + porcentJuros + "): R$" + valorJuros);
			System.out.println("Valor Parcela: R$" + valorParcela);
			
			porcentJuros += 5;
			
		}
		
	}

}
