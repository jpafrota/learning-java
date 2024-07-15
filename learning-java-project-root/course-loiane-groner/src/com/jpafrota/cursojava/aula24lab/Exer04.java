package com.jpafrota.cursojava.aula24lab;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		
		System.out.println("Digite a data");
		livro.dataEmprestimo = new Date();
		livro.cliente = "Loiane";
		
	}

}
