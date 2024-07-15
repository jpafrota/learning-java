package com.jpafrota.cursojava.aula48;

public class MultiplosCatchGenerico {

	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denominadores = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {

			try {
				System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
			}
			
			// a classe Throwable é superclasse de todas as exceptions E ERROS
			// usar Throwable não é uma boa prática
			// ao invés disso utilizamos a classe Exception
			// que é a superclasse de todas as exceções, não erros.
			catch (Exception exc) {
				System.out.println("Erro: " + exc.getMessage());
				exc.printStackTrace();
			}

		}

	}

}
