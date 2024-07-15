package com.jpafrota.cursojava.aula41;

public class Teste {

	public static void imprimirEndereco(Pessoa pessoa) {

		// A implementação do método "testeAbstracao" pode esclarecer melhor.
		pessoa.testeAbstracao();

	}

	public static void main(String[] args) {

		// Classes abstratas não podem ser instanciadas.
		// Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		imprimirEndereco(aluno);
		aluno.setEndereco("Rua E");
		professor.setEndereco("Rua A");
		
		// o código abaixo não funciona pois como já foi visto, ao instanciar um aluno de um TIPO diferente,
		// não obtemos acesso aos métodos daquela classe. somente os métodos referentes ao tipo declarado, que é Pessoa.
		// aluno.funcaoQualquer();

		// Métodos e atributos da superclasse abstrata podem ser usados por suas subclasses normalmente.
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());

	}

}
