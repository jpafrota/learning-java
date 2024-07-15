// QUESTÃO 08: Faça um programa que pergunte quanto você ganha por hora e o
// número de horas trabalhadas no mês. Calcule e mostre o total do seu salário
// no referido mês

package com.jpafrota.cursojava.aula13lab;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você recebe por hora de trabalho?");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalhou esse mês?");
		double horasTrabalhadas = scan.nextDouble();
		
		double salario = valorHora * horasTrabalhadas;
		
		System.out.println("Seu salário esse mês será de: R$" + salario + " reais");
		
	}

}
