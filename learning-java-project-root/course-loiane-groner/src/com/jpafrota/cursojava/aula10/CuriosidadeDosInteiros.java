package com.jpafrota.cursojava.aula10;

public class CuriosidadeDosInteiros {

	public static void main(String[] args) {
		
		int valorMax = 2147483647;
		int a = 1;
		
		System.out.println(valorMax + a);
		// O interessante aqui é que valorMax é o maior numero que java pode armazenar no tipo "int"
		// Porém, ao ser somado com qualquer valor, a variável "dá a volta" no range de números.
		// No caso, ao somar 1 ao valorMax obtém-se o primeiro valor mínimo do range "int", que é -2147483648
	}
}
