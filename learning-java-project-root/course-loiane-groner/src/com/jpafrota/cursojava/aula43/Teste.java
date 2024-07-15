package com.jpafrota.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		
		aluno1.setCursos("Ciência da Computação");
		
		double[] notas = {10, 9, 8, 7};
		
		aluno1.setNotas(notas);
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCursos("Ciência da Computação");
		
		double[] notas2 = {10, 9, 8, 7};
		
		aluno2.setNotas(notas2);
		
		// Tanto aluno1 == aluno2 e aluno1.equals(aluno2); darão o mesmo resultado.
		// Mesmo que aluno1 e aluno2 sejam iguais em seus atributos
		// Isso porque, por default, Java compara apenas a referência dos objetos
		// Ou seja, só daria true se fosse o mesmo endereço de memóia
		// O método "equals" funciona do mesmo jeito, quando herdado da classe OBJECT
		// Mas é possível sobrescrever esse método dentro da classe aluno
		System.out.println(aluno1 == aluno2);
		System.out.println(aluno1.equals(aluno2));
		
		// No exemplo abaixo é possível ver em prática a sobrescrita do método equals
		// A classe String sobrescreve esse método por padrão, comparando o conteúdo das variáveis ao invés do endereço de memória.
		String testando = "dasdasd";
		String testeee = "dasdasd";
		
		System.out.println(testando.equals(testeee));
		
	}

}
