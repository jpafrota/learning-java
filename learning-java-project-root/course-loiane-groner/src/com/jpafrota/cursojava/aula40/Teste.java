package com.jpafrota.cursojava.aula40;

public class Teste {

	public static void main(String[] args) {

		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		Pessoa aluno2 = new Aluno();
		
		// Sobrecarga de métodos dentro da classe (polimorfismo)
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(aluno2.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
		
	}

}
