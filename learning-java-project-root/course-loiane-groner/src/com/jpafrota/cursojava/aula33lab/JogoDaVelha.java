package com.jpafrota.cursojava.aula33lab;

public class JogoDaVelha {

	private String[][] tabuleiro;
	private int qtdPecas;
	private int jogador;
	private boolean ganhou;
	
	// CONSTRUCTORS
	public JogoDaVelha() {
		this.tabuleiro = new String[3][3];
		this.qtdPecas = 0;
		this.jogador = 1;
		this.ganhou = false;
	}
	// END OF CONSTRUCTORS

	// GETTERS AND SETTERS
	public String[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(String[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public int getQtdPecas() {
		return qtdPecas;
	}

	public void setQtdPecas(int qtdPecas) {
		this.qtdPecas = qtdPecas;
	}

	public int getJogador() {
		return jogador;
	}

	public void setJogador(int jogador) {
		this.jogador = jogador;
	}

	public boolean isGanhou() {
		return ganhou;
	}

	public void setGanhou(boolean ganhou) {
		this.ganhou = ganhou;
	}
	// END OF GETTERS AND SETTERS
	
	// METHODS
	
	public void mostrarTabuleiro() {
		
		for(int i = 0; i < tabuleiro.length; i++) {
			System.out.print("| ");
			for(int j = 0; j < tabuleiro[i].length; j++) {
				
				if(tabuleiro[i][j] != null) System.out.print(tabuleiro[i][j] + " | ");
				else System.out.print("  | ");
				
			}
			System.out.println("");
		}
		
	}
	
	public boolean verificarPosicao(int linha, int coluna) {
		
		return (tabuleiro[linha-1][coluna-1] != null);
		
	}
	
	public void jogarPeca(int linha, int coluna) {
		
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
	
	public void verificarVitoria() {
		
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
		
		if( (tabuleiro[0][0] == tabuleiro[1][1])
				&& (tabuleiro[1][1] == tabuleiro[2][2])
				&& (tabuleiro[0][0] != null) ) ganhou = true;
		
	}
	
	// END OF METHODS
	
}
