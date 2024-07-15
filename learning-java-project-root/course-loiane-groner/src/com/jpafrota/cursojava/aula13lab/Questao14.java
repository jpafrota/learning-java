//QUESTÃO 14: Faça um programa que peça o tamanho de um arquivo para download
//(em MB) e a velocidade de um link de Internet (em Mbps), calcule e 
//informe o tempo aproximado de download do arquivo usando este link 
//(em minutos)

package com.jpafrota.cursojava.aula13lab;

import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do arquivo em MB: ");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.print("Digite a velocidade da sua conexão em Mbps: ");
		double velocidadeConexao = scan.nextDouble();
		
		double tempo = (tamanhoArquivo / (velocidadeConexao / 10))/60d;
		
		System.out.println("O tempo aproximado de download é de: " + tempo + " minutos");
		
	}

}
