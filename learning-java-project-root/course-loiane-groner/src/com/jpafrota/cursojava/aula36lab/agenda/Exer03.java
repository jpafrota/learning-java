package com.jpafrota.cursojava.aula36lab.agenda;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Agenda agenda = new Agenda();
		
		System.out.println("Entre com o nome da agenda: ");
		
		agenda.setNome("Agenda 01");
		
		Contato[] contatos = new Contato[3];
		
		for(int i = 0; i < contatos.length; i++) {
			
			Contato c = new Contato();
			
			System.out.println("CONTATO " + (i+1) + ": ");
			System.out.print("Nome: ");
			c.setNome(scan.nextLine());
			System.out.print("E-mail: ");
			c.setEmail(scan.nextLine());
			System.out.print("Telefone: ");
			c.setTelefone(scan.nextLine());
			
			contatos[i] = c;
			
		}
		
		agenda.setContatos(contatos);
		
		System.out.println("\n------------------\n");
		
		if(agenda != null) {
			System.out.println(agenda.obterInfo());
		}
		
	}

}
