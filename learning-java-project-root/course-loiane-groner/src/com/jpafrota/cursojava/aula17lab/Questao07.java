package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int maior = Integer.MIN_VALUE;
		int entrada;
		
		for(int i = 0; i < 5; i++) {
		
			entrada = scan.nextInt();
			if(entrada > maior) maior = entrada;
			
		}
		
		System.out.println(maior);
		
	}

}
