package com.jpafrota.cursojava.aula24lab;

public class Exer06 {

	public static void main(String[] args) {

		ContatoAgenda contato = new ContatoAgenda();
		
		contato.numero = new String[5];
		contato.numero[0] = "(92) 98419-1630";
		contato.numero[1] = "(92) 98116-0826";
		contato.nome = "Jorge";
		contato.sobrenome = "Frota";
		contato.endereco = "Rua Plácido de Castro, 7";
		contato.email = "jorgepabloafrota@gmail.com";
		
		System.out.println("DADOS DO CONTATO: \n");
		System.out.println(contato.nome);
		System.out.println(contato.sobrenome);
		System.out.println(contato.numero[0]);
		System.out.println(contato.numero[1]);
		System.out.println(contato.endereco);
		System.out.println(contato.email);
	}

}
