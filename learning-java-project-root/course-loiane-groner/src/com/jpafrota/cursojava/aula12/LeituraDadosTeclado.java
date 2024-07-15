package com.jpafrota.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nomeCompleto = scan.nextLine();
		
		System.out.print("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
				
		System.out.print("Digite sua idade: ");
		int idade = scan.nextInt();

		System.out.print("Digite sua altura: ");
		float altura = scan.nextFloat();
		
		System.out.print("Quantos filhos você possui: ");
		byte temFilhos = scan.nextByte();
		
		System.out.print("Você tem animais de estimação?: ");
		boolean temPet = scan.nextBoolean();
		
		
		System.out.println("Seu nome completo é: " + nomeCompleto);
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		System.out.println("Sua idade é: " + idade + " anos");
		System.out.println("Sua altura é: " + altura + " metros");
		System.out.println("Você tem: " + temFilhos + " filhos");
		System.out.println("Possui animais de estimação: " + temPet);
	}
}
