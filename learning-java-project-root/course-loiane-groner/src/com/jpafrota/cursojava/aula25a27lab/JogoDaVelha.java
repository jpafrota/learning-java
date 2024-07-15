package com.jpafrota.cursojava.aula25a27lab;

public class JogoDaVelha {

	String[][] tabuleiro = new String[3][3];
	int qtdPecas;
	int jogador = 1;
	boolean ganhou;
	
	void mostrarTabuleiro() {
		
		for(int i = 0; i < tabuleiro.length; i++) {
			System.out.print("| ");
			for(int j = 0; j < tabuleiro[i].length; j++) {
				
				if(tabuleiro[i][j] != null) System.out.print(tabuleiro[i][j] + " | ");
				else System.out.print("  | ");
				
			}
			System.out.println("");
		}
		
	}
	
	boolean verificarPosicao(int linha, int coluna) {
		
		return (tabuleiro[linha-1][coluna-1] != null);
		
	}
	
	void jogarPeca(int linha, int coluna) {
		
		if (jogador == 1) {
			tabuleiro[linha-1][coluna-1] = "X";
			qtdPecas++;
			jogador++;
		}
		else {
			tabuleiro[linha-1][coluna-1] = "O";
			qtdPecas++;
			jogador--;
		}
		
	}
	
	void verificarVitoria() {
		
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
		
	}
	
}
