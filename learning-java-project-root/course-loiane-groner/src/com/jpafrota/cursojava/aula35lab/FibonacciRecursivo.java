package com.jpafrota.cursojava.aula35lab;

public class FibonacciRecursivo {

	public static double fibonacci(int num) {

		if(num == 1 || num == 2) return 1.0;
		return fibonacci(num-1) + fibonacci(num-2);
		
	}
	
}
