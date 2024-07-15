// QUESTÃO ANULADA NA LISTA

package com.jpafrota.cursojava.aula19lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double[] vetA = new double[20];
		double cotacao;
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.print("Cotação do Dólar (R$): ");
		cotacao = scan.nextDouble();
		
		for(int i = 0; i < vetA.length; i++) {
			
			vetA[i] = (i + 1) * cotacao;
			System.out.println("U$" + (i + 1) + ": R$" + df.format(vetA[i]));
			
		}
		
	}

}