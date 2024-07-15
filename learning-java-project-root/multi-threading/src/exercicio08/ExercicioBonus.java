package exercicio08;

import java.util.ArrayList;
import java.util.List;
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
	
	public void gerarMatriz(int n) {
		
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

class Multiplicador extends Thread {
	
	private Matriz matrizA, matrizB, matrizC;
	private int linha, coluna;
	
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

class Worker4 {

    private Random random = new Random();

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void stageOne() {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock1) {
            	list1.add(random.nextInt(10000));
            }
     }

    public void stageTwo() {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock2) {
            	list2.add(random.nextInt(10000));
            }
    }

    public void process() {
        for (int i = 0; i < 1000; i++) {
            stageOne();
            stageTwo();
        }
    }

    public void principal () {
    	
        System.out.println("Starting ...");
        
        long start = System.currentTimeMillis();
        
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                process();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                process();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Random gerador = new Random();
		
		int tamanhoMatriz = gerador.nextInt(9) + 2;
		
		System.out.println("Matrix A " + tamanhoMatriz + "x" + tamanhoMatriz + ":");
		Matriz matrizA = new Matriz(tamanhoMatriz);
		matrizA.imprimir();
		
		System.out.println("Matrix B " + tamanhoMatriz + "x" + tamanhoMatriz + ":");
		Matriz matrizB = new Matriz(tamanhoMatriz);
		matrizB.imprimir();
		
		Matriz matrizC = new Matriz(tamanhoMatriz);
		
		ExecutorService multiplicador = Executors.newFixedThreadPool(5);
		
		for(int i = 0; i < tamanhoMatriz; i++) {
			for(int j = 0; j < tamanhoMatriz; j++) {
				
				multiplicador.submit(new Multiplicador(matrizA, matrizB, matrizC, i, j));
			
			}
		}
		
		multiplicador.shutdown();

		System.out.println("\n> All tasks submitted\n");

		try {
			multiplicador.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n> All tasks completed");
        
        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + "ms");
        System.out.println("List1: " + list1.size() + "; List2: " + list2.size());
		matrizC.imprimir();
		
		// COMENTÁRIO SOBRE A EXECUÇÃO:
		// O tempo foi absurdamente parecido. Não sei se fiz algo errado ou se é isso mesmo, mas depois de adicionar
		// a multiplicação de matrizes, a diferença no tempo de execução foi menos de 5 milissegundos considerando uma média geral aproximada, i.e.,
		// não houve alteração se considerarmos uma margem de erro de +/- 5ms.

    }
    
}

public class ExercicioBonus {

	public static void main (String[] args) {
		
		Worker4 w = new Worker4();
		w.principal();
		
	  }
	
}
