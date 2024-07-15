package com.jpafrota.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {

		//DICA: Use o debugger nas linhas 12 a 18 para ver a diferença entre & e &&!
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		boolean resultado1 = falso &
				verdadeiro;
		boolean resultado2 = falso &&
				verdadeiro;
		
		System.out.println(resultado1);
		System.out.println(resultado2);
	}

}
