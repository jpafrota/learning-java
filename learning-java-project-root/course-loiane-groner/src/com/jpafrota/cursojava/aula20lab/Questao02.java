package com.jpafrota.cursojava.aula20lab;

public class Questao02 {

	public static void main(String[] args) {

		int[][] M = new int[10][10];
		
		// maior e menor da linha 5
		int[] linha5 = new int[2];
		
		// maior e menor da coluna7
		int[] coluna7 = new int[2];
		
		for(int i = 0; i < M.length; i++) {
			
			for(int j = 0; j < M[i].length; j++) {
				
				M[i][j] = (int) Math.round(Math.random() * 10);
				System.out.print(M[i][j] + " ");
				
				if(i == 4) {
					
					if(j == 0) {
						linha5[0] = M[i][j];
						linha5[1] = M[i][j];
					}
					if(M[i][j] > linha5[0]) {
						linha5[0] = M[i][j];
					}
					else if(M[i][j] < linha5[1]) {
						linha5[1] = M[i][j];
					}
					
				}
				
				if(j == 6) {
					
					if(i == 0) {
						coluna7[0] = M[i][j];
						coluna7[1] = M[i][j];
					}
					if(M[i][j] > coluna7[0]) {
						coluna7[0] = M[i][j];
					}
					else if(M[i][j] < coluna7[1]) {
						coluna7[1] = M[i][j];
					}
					
				}
				
			}
			System.out.println(" ");
			
		}
		
		System.out.println("LINHA5 MAIOR: " + linha5[0] + " | MENOR: " + linha5[1]);
		System.out.println("COLUNA7 MAIOR: " + coluna7[0] + " | MENOR: " + coluna7[1]);
		
		
	}

}
