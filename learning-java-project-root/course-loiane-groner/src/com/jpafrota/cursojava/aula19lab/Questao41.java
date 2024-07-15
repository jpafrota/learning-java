package com.jpafrota.cursojava.aula19lab;

import java.util.Scanner;

public class Questao41 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[10];
		
		for(int i = 0; i < vetA.length; i++) {
			
			vetA[i] = scan.nextInt();
			
		}
		
		System.out.println("Digite a chave de busca: ");
		int chave = scan.nextInt();
		
		for(int i = 0; i < vetA.length && i != chave; i++) {
			
			if(chave == vetA[i]) System.out.println("Chave presente!");
			
		}
		
	}

}
