package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a quantidade de pessoas: ");
		int qtd = scan.nextInt();
		
		double idade;
		double soma = 0;
		double media;
		
		String classificacao;
		
		for(int i = 1; i <= qtd; i++) {
			System.out.print("Digite a " + i + "ª idade: ");
			idade = scan.nextDouble();
			soma += idade;
		}
		
		media = soma / qtd;
		
		System.out.println("A média das idades informadas é " + media);
		
		if(media <= 25) {
			classificacao = "jovem";
		}
		else if(media <= 60) {
			classificacao = "adulta";
		}
		else {
			classificacao = "idosa";
		}
		
		System.out.println("Sua turma é " + classificacao);
		
	}

}
