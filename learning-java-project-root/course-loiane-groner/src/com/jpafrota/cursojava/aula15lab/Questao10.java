package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Em que turno você estuda?");
		String turno = scan.next();
		
		/*
		if(turno.equalsIgnoreCase("M")) {
			System.out.println("Bom dia flor do dia!!");
		}		
		
		else if(turno.equalsIgnoreCase("V")) {
			System.out.println("Boa tarde rosa da tarde!!");
		}
		
		else if(turno.equalsIgnoreCase("N")) {
			System.out.println("Boa noite dama da noite!!");
		}
		
		else {
			System.out.println("Opãoo inválida.");
		}*/
		
		switch(turno) {
		case "M":
		case "m":
			System.out.println("Bom dia flor do dia!!");
			break;
		case "v":
		case "V":
			System.out.println("Boa tarde rosa da tarde!!");
			break;
		case "N":
		case "n":
			System.out.println("Boa noite dama da noite!!");
			break;
		default:
			System.out.println("Opãoo inválida.");
		}
		
	}
}
