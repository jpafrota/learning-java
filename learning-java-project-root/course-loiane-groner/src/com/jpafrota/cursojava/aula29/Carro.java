package com.jpafrota.cursojava.aula29;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel; 
	double consumoCombustivel; 
	
	Carro(String marca_, String modelo_, int numPassageiros_, double capacidade, double consumo){
		
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capacidade;
		consumoCombustivel = consumo;
		
	}
	
	// É uma boa prática de programação Java sempre manter o construtor vazio mesmo já tendo inicializado outro.
	public Carro(){
		
	}
	
}
