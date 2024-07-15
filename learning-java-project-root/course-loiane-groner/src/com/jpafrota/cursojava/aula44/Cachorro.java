package com.jpafrota.cursojava.aula44;

public class Cachorro extends Mamifero implements AnimalEstimacao, AnimalDomesticado{

	private String raca;
	private double tamanho;
	
	// getters e setters
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	// metodos da interface
	public void brincar() {
		System.out.println("playing");
	}
	public void levarPassear() {
		System.out.println("levando p passear");
	}
	public void alimentar() {
		System.out.println("alimentando dog");
	}
	public void levarVeterinario() {
		System.out.println("levando dog no vet");
	}
	public void chamarVeterinario() {
		System.out.println("chamando vet p dog");
	}
	
	// metodos das superclasses
	public void amamentar() {
		System.out.println("amamentando cachorro");
	}
	public void emitirSom() {
		System.out.println("au au au");
	}
	
	
}
