package com.jpafrota.cursojava.aula43lab;

public class Questao03 {

	public static void main(String[] args) {

		System.out.println("ZOO\n");
		System.out.println("----------------\n");

		Animal animais[] = new Animal[3];
		
		Mamifero camelo = new Mamifero();
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setPatas(4);
		camelo.setCor("Amarelo");
		camelo.setVelocidade(2);
		
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setCor("Cinzento");
		tubarao.setVelocidade(1.5);
		tubarao.setCaracteristicas("Barbatanas e cauda");
		
		Mamifero ursoDoCanada = new Mamifero();
		ursoDoCanada.setNome("Urso-do-Canadá");
		ursoDoCanada.setComprimento(180);
		ursoDoCanada.setCor("Vermelho");
		ursoDoCanada.setVelocidade(0.5);
		ursoDoCanada.setAlimento("Mel");
		
		animais[0] = camelo;
		animais[1] = tubarao;
		animais[2] = ursoDoCanada;
		
		for(Animal animal : animais) {
			System.out.println(animal.toString());
			System.out.println("---------------------");
		}
		
	}

}
