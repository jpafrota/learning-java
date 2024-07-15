package com.jpafrota.cursojava.aula25;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		
		System.out.print("Autonomia: ");
		double autonomia = van.obterAutonomia();
		System.out.print(autonomia + " km");
		
		double km = 40;
		double combustivel = van.calcularCombustivel(km);
		System.out.println("\nCombustivel necessario para " + km + " km: " + combustivel + "litros");
		
		Carro fusca = new Carro();
		
		fusca.marca = "Wolksvagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		
	}

}
