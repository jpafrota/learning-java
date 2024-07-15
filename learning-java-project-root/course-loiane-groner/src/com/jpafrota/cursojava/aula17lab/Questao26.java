package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao26 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cand1 = 0, cand2 = 0, cand3 = 0;
		
		System.out.print("Digite a quantidade de eleitores: ");
		int qtd = scan.nextInt();
		int voto;
		
		
		for (int i = 1; i <= qtd; i++) {

			do {
				System.out.println("Eleitor nº " + i);
				System.out.println("Em qual candidato deseja votar? 1 / 2 / 3");
				voto = scan.nextInt();

				if (voto == 1)
					cand1++;
				else if (voto == 2)
					cand2++;
				else if (voto == 3)
					cand3++;
				else {
					System.out.println("Voto inválido. Tente novamente\n");
				}

			} while (voto < 1 || voto > 3);

		}
		
		
		System.out.println("Quantidade de votos");
		System.out.println("Candidato 1: " + cand1);
		System.out.println("Candidato 2: " + cand2);
		System.out.println("Candidato 3: " + cand3);		
		
	}

}
