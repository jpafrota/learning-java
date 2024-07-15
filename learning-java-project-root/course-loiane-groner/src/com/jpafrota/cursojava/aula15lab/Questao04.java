package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
//		  String letra = scan.next();
//		  
//		  if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
//		  letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
//		  letra.equalsIgnoreCase("u")) { 
//			  System.out.println("Vogal"); } 
//		  
//		  else {
//			  System.out.println("Consoante");
//		  }
		 
		
		String letra = scan.next();
		
		if(letra.length() > 1) {
			System.out.println("Entrada não é uma letra");
		}
		else {
			switch(letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println("A letra digitada é uma vogal");
				break;
			default:
				System.out.println("A letra digitada é uma consoante");
			}
		}
	}

}
