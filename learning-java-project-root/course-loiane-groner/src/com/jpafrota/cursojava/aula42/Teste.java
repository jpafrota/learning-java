package com.jpafrota.cursojava.aula42;

public class Teste {

	public static void main(String[] args) {

		final double valorPi = 3.14;
		
		Pessoa pessoa = new Pessoa();
		// Como Pessoa é classe final, não pode ser estendida
		// Pessoa aluno1 = new Aluno();
		
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		// Como a variável valorPi foi declarada como final, não é possível alterar seu valor posteriormente.
		
		// valorPi = 3.4524;
		
		System.out.println(Constantes.CURSO_COMPLETO);
		System.out.println(Constantes.URL_BLOG);
		System.out.println(valorPi);
		
	}

}
