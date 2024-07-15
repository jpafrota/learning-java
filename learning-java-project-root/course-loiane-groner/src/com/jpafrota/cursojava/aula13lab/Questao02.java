//QUESTãO 02: Faça um programa que peça um número e então
//mostre a mensagem "O número informado foi [número]"

package com.jpafrota.cursojava.aula13lab;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int valor = scan.nextInt();
		System.out.println("O numero informado foi: " + valor);
	}

}
