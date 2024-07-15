package com.jpafrota.cursojava.aula30;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel; 
	double consumoCombustivel; 
	
	// É uma boa prática de programação Java sempre manter o construtor vazio mesmo já tendo inicializado outro.
	public Carro(){
		
	}
	
	Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel){
		
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
		
	}

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando construtor com 3 parâmetros");
	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Chamando construtor com 2 parâmetros");
	}
	
	
	
}
