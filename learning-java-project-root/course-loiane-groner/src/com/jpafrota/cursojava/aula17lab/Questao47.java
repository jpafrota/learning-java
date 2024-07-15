package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao47 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String atleta = "";
		
		double melhor = 0, pior = 0;
		double salto;
		
		double soma = 0;
		double media;
		
		do {
			
			System.out.print("Entre com o nome do atleta: ");
			atleta = scan.nextLine();
			
			if(atleta.length() == 0) break;
			
			for(int i = 1; i <= 7; i++) {
				
				System.out.println(i + "ª nota: ");
				salto = scan.nextDouble();
				scan.nextLine();
				
				if(soma == 0) {
					melhor = salto;
					pior = salto;
				}
				else if(salto > melhor) {
					melhor = salto;
				}
				else if(salto < pior) {
					pior = salto;
				}
				
				soma += salto;
				
			}
			
			soma -= (pior + melhor);
			media = soma / 5;
			
			System.out.println("Melhor nota: " + melhor);
			System.out.println("Pior nota: " + pior);
			System.out.printf("Resultado Final: %.2f\n\n", media);
			
			soma = 0;
			melhor = 0;
			pior = 0;
			
		} while(atleta.length() != 0);
		
	}

}
