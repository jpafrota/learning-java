package com.jpafrota.cursojava.aula34;

public class TesteCalculadora {

	public static void main(String[] args) {

		// MODIFICADORES STATIC NÃO PRECISAM DE UMA INSTÂNCIA DA CLASSE
		// PARA SEREM ACESSADOS. VALE PARA MÉTODOS E VARIÁVEIS!
		// NESSE EXEMPLO A CLASSE MINHA CALCULADORA NÃO FOI INSTANCIADA E POSSUI
		// TRÊS MÉTODOS ESTÁTICOS.
		
		//MinhaCalculadora calc = new MinhaCalculadora();
		//calc.soma(1, 2);
		
		MinhaCalculadora.soma(1, 2);
		
	}

}
