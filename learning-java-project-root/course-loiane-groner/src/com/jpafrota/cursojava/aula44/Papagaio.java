package com.jpafrota.cursojava.aula44;

public class Papagaio extends Ave implements AnimalDomesticado{

	public void voar() {
		System.out.println("batendo asas");
	}
	public void emitirSom() {
		System.out.println("Pruu pruu");
	}
	
	public void alimentar() {
		System.out.println("feeding bird");
	}
	public void levarVeterinario() {
		System.out.println("vet bird");
	}
	public void chamarVeterinario() {
		System.out.println("call vet bird");
	}

	
	
}
