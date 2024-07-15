package com.jpafrota.cursojava.aula20lab;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] tabuleiro = new String[3][3];
		
		int linha;
		int coluna;
		
		int jogador = 0;
		
		boolean ganhou = false;
		int qtdPecas = 0;
		
		System.out.println("======= JOGO DA VELHA =======");
		
		do {
			
			
			System.out.println("\nJogador " + ((jogador%2)+1));
			
			// Entrada e verificação de linha
			do {
				System.out.print("Linha: ");
				linha = scan.nextInt();
				if(linha < 0) System.out.println("LINHA INVÁLIDA. Tente novamente.");
			} while(linha < 0 || linha > 3);
			
			if(linha == 0) {
				System.out.println("Partida abortada");
				break;
			}
			
			// Entrada e verificação de coluna
			do{
				System.out.print("Coluna: ");
				coluna = scan.nextInt();
				if(coluna < 0) System.out.println("COLUNA INVÁLIDA. Tente novamente.");
			} while(coluna < 0 || coluna > 3);
			
			if(coluna == 0) {
				System.out.println("Partida abortada");
				break;
			}
			
			// Verificação e atribuição de peça no tabuleiro
			if(tabuleiro[linha-1][coluna-1] != null) {
				System.out.println("Posição já possui valor. Tente novamente\n");
				continue;
			}
			else {
				
				jogador++;
				
				if (jogador % 2 == 1) {
					tabuleiro[linha-1][coluna-1] = "X";
					qtdPecas++;
				}
				else {
					tabuleiro[linha-1][coluna-1] = "O";
					qtdPecas++;
				}
				
			}
			
			
			System.out.println("");
			
			// Impressão do tabuleiro
			for(int i = 0; i < tabuleiro.length; i++) {
				System.out.print("| ");
				for(int j = 0; j < tabuleiro[i].length; j++) {
					
					if(tabuleiro[i][j] == null) System.out.print("  | ");
					else System.out.print(tabuleiro[i][j] + " | ");
				}
				System.out.println("");
			}
			
			// Verifica se há ganhadores
			for(int i = 0; i < tabuleiro.length; i++) {
				
				if( (tabuleiro[i][0] == tabuleiro[i][1]) 
						&& (tabuleiro[i][1] == tabuleiro[i][2]) 
						&& (tabuleiro[i][0] != null) ) ganhou = true;
				
				for(int j = 0; j < tabuleiro[i].length; j++) {
					
					if( (tabuleiro[0][j] == tabuleiro[1][j]) 
							&& (tabuleiro[1][j] == tabuleiro[2][j]) 
							&& (tabuleiro[0][j] != null) ) ganhou = true;
					
				}
				
			}
			if( tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] ) ganhou = true;

		} while(!ganhou && qtdPecas < 9);

		if(ganhou) {
			System.out.println("PARABÉNS!!!! você GANHOU (JOGADOR " + ((jogador%2)+1) + ")");
		}
		else {
			System.out.println("NINGUÉM GANHOU ESSA PARTIDA.");
		}
		
	}
	
}
