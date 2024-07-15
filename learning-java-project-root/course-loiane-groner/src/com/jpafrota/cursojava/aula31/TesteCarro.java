package com.jpafrota.cursojava.aula31;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro("Fiat", "Uno");
	
		System.out.println(van.getMarca());
		
		van.setMarca("Testando métodos getters e setters");
		
		System.out.println("\n" + van.getMarca());
		System.out.println(van.getModelo());
		System.out.println(van.getNumPassageiros());
		
	}

}
