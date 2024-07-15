package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int suspeito = 0;
		
		System.out.println("Telefonou para a vítima?");
		String resposta = scan.next();
		if(resposta.equalsIgnoreCase("Sim")) suspeito++;
		
		System.out.println("Esteve no local do crime?");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("Sim")) suspeito++;
		
		System.out.println("Mora perto da vítima?");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("Sim")) suspeito++;
		
		System.out.println("Devia para a vítima?");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("Sim")) suspeito++;
		
		System.out.println("Já trabalhou com a vítima?");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("Sim")) suspeito++;
		
		if(suspeito < 2) System.out.println("Inocente.");
		else if(suspeito == 2) System.out.println("Suspeito.");
		else if(suspeito <= 4) System.out.println("Cúmplice.");
		else System.out.println("Assassino.");
			
	}
}
