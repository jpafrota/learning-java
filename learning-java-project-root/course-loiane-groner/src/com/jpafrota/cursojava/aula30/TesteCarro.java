package com.jpafrota.cursojava.aula30;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro("Fiat", "Ducato", 10, 100, 0.2);
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		Carro fusca = new Carro("Wolksvagen", "Fusca");
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
		System.out.println(fusca.numPassageiros);
		
	}

}
