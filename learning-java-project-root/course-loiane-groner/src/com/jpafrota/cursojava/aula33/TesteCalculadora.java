package com.jpafrota.cursojava.aula33;

public class TesteCalculadora {

	public static void main(String[] args) {

		MinhaCalculadora calculadora = new MinhaCalculadora();
		
		int[] vetor = {5, 4, 3};
		
		System.out.println(calculadora.soma(1, 2));
		System.out.println(calculadora.soma(1, 2, 3));
		System.out.println(calculadora.soma(3.0, 2.0));
		System.out.println(calculadora.soma(vetor));
	}

}
