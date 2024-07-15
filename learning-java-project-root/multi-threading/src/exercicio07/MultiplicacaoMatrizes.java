package exercicio07;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Matriz {
	
	private int n;
	private int[][] grid;
	
	public int getPos(int i, int j) {
		return this.grid[i][j];
	}

	public void setPos(int i, int j, int valor) {
		this.grid[i][j] = valor;
	}
	
	public int getSize() {
		return this.n;
	}

	public Matriz(int n) {
		this.n = n;
		this.grid = new int[n][n];
		gerarMatriz(n);
	}
	
	private void gerarMatriz(int n) {
		
		Random gerador = new Random();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				this.grid[i][j] = gerador.nextInt(10);
			}
		}
		
	}
	
	public void imprimir() {
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(this.grid[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
	}
	
}

public class MultiplicacaoMatrizes {

	static class Multiplicador extends Thread {
		
		private Matriz matrizA;
		private Matriz matrizB;
		private Matriz matrizC;
		private int linha;
		private int coluna;
		
		public Multiplicador(Matriz matrizA, Matriz matrizB, Matriz matrizC, int linha, int coluna) {
			this.matrizA = matrizA;
			this.matrizB = matrizB;
			this.matrizC = matrizC;
			this.linha = linha;
			this.coluna = coluna;
		}
		
		public void run() {
			
			System.out.println("> STARTED multiplying on line " + (linha + 1) + " col " + (coluna + 1));
			
			int resultado = 0;
			
			for(int i = 0; i < matrizC.getSize(); i++) {
				resultado += matrizA.getPos(linha, i) * matrizB.getPos(i, coluna);
			}
			
			matrizC.setPos(linha, coluna, resultado);
			
			System.out.println("> COMPLETED multiplying on line " + (linha + 1) + " col " + (coluna + 1));
			
		}
		
	}
	
	public static void main(String[] args) {

		Random gerador = new Random();
		
		// NxN size
		int n = gerador.nextInt(9) + 2;
		
		System.out.println("Matrix A " + n + "x" + n + ":");
		Matriz matrizA = new Matriz(n);
		matrizA.imprimir();
		
		System.out.println("Matrix B " + n + "x" + n + ":");
		Matriz matrizB = new Matriz(n);
		matrizB.imprimir();
		
		Matriz matrizC = new Matriz(n);
		
		ExecutorService multiplicador = Executors.newFixedThreadPool(5);
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				
				multiplicador.submit(new Multiplicador(matrizA, matrizB, matrizC, i, j));
			
			}
		}
		
		multiplicador.shutdown();
		System.out.println("\n> All tasks submitted\n");

		try {
			multiplicador.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException ignored) {}
		
		System.out.println("\n> All tasks completed\n");

		matrizC.imprimir();
		
	}

}
