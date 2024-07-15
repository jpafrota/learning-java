package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String password, userName;
		
		
		
		System.out.println("Digite seu nome de usuário: ");
		userName = scan.next();
		
		do {
			
			System.out.println("Digite sua senha: ");
			password = scan.next();
			
			if(password.equalsIgnoreCase(userName)) {
				System.out.println("ERRO! Senha não pode conter o nome de usuário.\n");
			}
			else {
				System.out.println("usuário criado com sucesso");
			}
		
		} while (password.equalsIgnoreCase(userName));
	}

}