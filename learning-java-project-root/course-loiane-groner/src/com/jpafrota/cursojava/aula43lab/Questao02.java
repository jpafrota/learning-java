package com.jpafrota.cursojava.aula43lab;

import java.util.Scanner;

public class Questao02 {

	public static void cadastrarPf(PessoaFisica pf) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = scan.nextLine();
		
		System.out.print("CPF: ");
		String cpf = scan.nextLine();
		
		System.out.print("Renda Bruta: R$");
		double renda = scan.nextDouble();
		
		pf.setCpf(cpf);
		pf.setNome(nome);
		pf.setRendaBruta(renda);
		
	}
	
	public static void cadastrarPj(PessoaJuridica pj) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = scan.nextLine();
		
		System.out.print("CNPJ: ");
		String cnpj = scan.nextLine();
		
		System.out.print("Renda Bruta: R$");
		double renda = scan.nextDouble();
		
		pj.setCnpj(cnpj);
		pj.setNome(nome);
		pj.setRendaBruta(renda);
		
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Contribuinte contribuintes[] = new Contribuinte[6];
		
		
		for(int i = 0; i < contribuintes.length; i++) {
			System.out.println("1 - PF ou 2 - PJ?");
			int tipo = scan.nextInt();
			
			if(tipo == 1) {
				PessoaFisica pf = new PessoaFisica();
				cadastrarPf(pf);
				contribuintes[i] = pf;
			} else {
				PessoaJuridica pj = new PessoaJuridica();
				cadastrarPj(pj);
				contribuintes[i] = pj;
			}
		}
		
		System.out.println("---------------------------------------");
		for(Contribuinte aux : contribuintes) {
			System.out.println(aux.toString());
		}
		
	}

}