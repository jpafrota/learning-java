package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int entrada = scan.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(entrada + " x " + i + " = " + entrada*i);
		}
		
	}

}
