package com.jpafrota.cursojava.aula25a27lab;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		JogoDaVelha jogodavelha = new JogoDaVelha();
		
		int linha, coluna;
		
		jogodavelha.qtdPecas = 0;
		jogodavelha.ganhou = false;
		
		System.out.println("============ JOGO DA VELHA ===========\n");
		
		do {
			
			jogodavelha.mostrarTabuleiro();
			
			System.out.println("VEZ DO JOGADOR " + jogodavelha.jogador);
			do {
				System.out.print("Linha: ");
				linha = scan.nextInt();
				if(linha < 1 || linha > 3) System.out.println("Linha inválida. Tente novamente.\n");
			} while(linha < 1 || linha > 3);
			
			do {
				System.out.print("Coluna: ");
				coluna = scan.nextInt();
				if(coluna < 1 || coluna > 3) System.out.println("Coluna inválida. Tente novamente.\n");
			} while(coluna < 1 || coluna > 3);
			
			if(jogodavelha.verificarPosicao(linha, coluna)) {
				System.out.println("Posição já possui valor. Tente novamente.");
			}
			else {
				jogodavelha.jogarPeca(linha, coluna);
			}
			
			jogodavelha.verificarVitoria();
			
		} while(!jogodavelha.ganhou && jogodavelha.qtdPecas < 9);
		
		if(jogodavelha.ganhou) System.out.println("PARABENS!!! GANHADOR: " + ((jogodavelha.jogador % 2)+1));
		else System.out.println("NINGUÉM GANHOU ESSA PARTIDA.");
		jogodavelha.mostrarTabuleiro();
				
	}

}
