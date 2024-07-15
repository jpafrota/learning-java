package com.jpafrota.cursojava.aula33lab;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		JogoDaVelha jogodavelha = new JogoDaVelha();
		
		int linha, coluna;
		
		System.out.println("============ JOGO DA VELHA ===========\n");
		
		do {
			
			jogodavelha.mostrarTabuleiro();
			
			System.out.println("VEZ DO JOGADOR " + jogodavelha.getJogador());
			
			linha = validarEntrada("Linha", scan);
			coluna = validarEntrada("Coluna", scan);
			
			if(jogodavelha.verificarPosicao(linha, coluna)) {
				System.out.println("Posição já possui valor. Tente novamente.");
			}
			else {
				jogodavelha.jogarPeca(linha, coluna);
			}
			
			jogodavelha.verificarVitoria();
			
		} while(!jogodavelha.isGanhou() && jogodavelha.getQtdPecas() < 9);
		
		if(jogodavelha.isGanhou()) System.out.println("PARABENS!!! GANHADOR: JOGADOR " + ((jogodavelha.getJogador() % 2)+1));
		else System.out.println("NINGUÉM GANHOU ESSA PARTIDA.");
		jogodavelha.mostrarTabuleiro();
		
	}
	
	static int validarEntrada(String tipo, Scanner scan) {
		
		int valor = 0;
		do {
			System.out.print(tipo + ": ");
			valor = scan.nextInt();
			if(valor < 1 || valor > 3) System.out.println(tipo + " inválida. Tente novamente.\n");
		} while(valor < 1 || valor > 3);
		
		return valor;
		
	}

}
