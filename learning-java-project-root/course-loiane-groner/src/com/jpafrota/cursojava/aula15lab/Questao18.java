package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com um dia: ");
		int dia = scan.nextInt();
		
		System.out.print("Entre com um mês: ");
		int mes = scan.nextInt();
		
		System.out.print("Entre com um ano: ");
		int ano = scan.nextInt();
		
		int erro = 0;
		
		if(dia < 0 || dia > 31) {
			System.out.println("ERRO! Dia inválido.");
			erro++;
		}
		
		if(mes < 0 || mes > 12) {
			System.out.println("ERRO! Mês inválido");
			erro++;
		}

		if(ano < 0) {
			System.out.println("ERRO! Ano inválido");
			erro++;
		}
		
		if(erro == 0) System.out.println("Data válida!!");
		
	}
}
