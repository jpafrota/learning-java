package com.jpafrota.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {

		double[] temperaturas = new double[365];
		
		for(int i = 0; i < 5; i++) {
			temperaturas[i] = (i+1)*10;
		}
		
		for(double temp : temperaturas) {
			
			System.out.println("Temperatura: " + temp);
			
		}
		
	}

}
