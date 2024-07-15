package com.jpafrota.cursojava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		//AND
		System.out.println(verdadeiro && falso);
		
		//OR
		System.out.println(verdadeiro || falso);
		
		//XOR (OU Exclusivo)
		System.out.println(verdadeiro ^ falso);

		//AND (2 teste)
		System.out.println(!verdadeiro && falso);
		
	}
	
}
