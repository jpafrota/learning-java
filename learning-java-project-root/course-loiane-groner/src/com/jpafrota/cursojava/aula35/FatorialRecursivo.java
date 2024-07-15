package com.jpafrota.cursojava.aula35;

public class FatorialRecursivo {

	public static double calcularFatorial(int num) {
		
		if(num < 2) return num;
		return num * calcularFatorial(num-1);
		
	}
	
}
