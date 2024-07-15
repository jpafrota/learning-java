package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite seu salário: ");
		double salario = scan.nextDouble();
		
		double aumento;
		double percentual;
		
		if(salario <= 280) {
			percentual = 20d/100d;
		}
		else if(salario <= 700) {
			percentual = 15d/100d;
		}
		else if(salario <= 1500) {
			percentual = 10d/100d;
		}
		else {
			percentual = 5d/100d;
		}
		
		double antigoSalario = salario;
		
		aumento = salario * percentual;
		salario = salario + aumento;
		
		System.out.println("Seu salário antes do reajuste era de: R$" + antigoSalario);
		System.out.println("Percentual de aumento: " + percentual*100 + "%");
		System.out.println("Aumento: R$" + aumento);
		System.out.println("Seu novo salário é de: R$" + salario);
		
	}

}
