package com.jpafrota.cursojava.aula35lab;

public class Somatorio {

	public static int somatorio(int n) {
		
		if(n == 1) return 1;
		return n + somatorio(n-1);
		
	}
	
}
