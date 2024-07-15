package com.jpafrota.cursojava.aula44;

public class Gato extends Mamifero implements AnimalEstimacao, AnimalDomesticado{

	private String raca;
	
	// get e set
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	// metodos interfaces
	public void brincar() {
		System.out.println("brincando c miau");
	}
	public void levarPassear() {
		System.out.println("passeando c miau");
	}
	public void alimentar() {
		System.out.println("alimentando miau");
	}
	public void levarVeterinario() {
		System.out.println("levando gato no vet");
	}
	public void chamarVeterinario() {
		System.out.println("chamando vet p gato");
	}
	
	// metodos superclass
	public void amamentar() {
		System.out.println("miau amamentando");
	}
	public void emitirSom() {
		System.out.println("miau miau");
	}
	
}
