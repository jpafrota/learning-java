package com.jpafrota.cursojava.aula20lab;

public class Questao01 {

	public static void main(String[] args) {

		int M[][] = new int[4][4];
		
		int[] pos = {0, 0};
		int maior = 0;
		
		for(int i = 0; i < M.length; i++) {
			
			for(int j = 0; j < M[i].length; j++) {
				
				M[i][j] = (int) Math.round( Math.random() * 10 );
				
				if(M[i][j] > maior) {
					maior = M[i][j];
					pos[0] = i + 1;
					pos[1] = j + 1;
				}
				
				System.out.print(M[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("MAIOR: " + maior);
		System.out.println("POSICAO: (" + pos[0] + ", " + pos[1] + ")");
		
		
	}

}
