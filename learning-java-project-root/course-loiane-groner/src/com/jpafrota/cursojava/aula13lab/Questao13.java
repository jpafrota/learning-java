//QUESTÃO 15: Faça um Programa que pergunte quanto você ganha por hora e o
//número de horas trabalhadas no mês. Calcule e mostre o total do seu
//salário no referido mês, sabendo-se que são descontados 11% para o
//Imposto de Renda, 8% para o INSS e 5% para o sindicato, Faça um
//programa que nos dê
//a. salário bruto.
//b. quanto pagou ao INSS.
//c. quanto pagou ao sindicato.
//d. o salário líquido.
//e. calcule os descontos e o salário líquido, conforme a tabela
//abaixo:
//+ salário Bruto : R$ - IR (11%) : R$ - INSS
//(8%) : R$ - Sindicato ( 5%) : R$ = salário
//Liquido : R$
//Obs.: salário Bruto - Descontos = salário líquido

package com.jpafrota.cursojava.aula13lab;

import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você recebe por hora de trabalho?");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalhou esse mês?");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = valorHora * horasTrabalhadas;
				
		double ir = (11d/100d) * salarioBruto;
		double inss = (8d/100d) * salarioBruto;
		double sindicato = (5d/100d) * salarioBruto;
		double descontos = ir + inss + sindicato;
		
		double salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Salario Bruto: " + salarioBruto);
		System.out.println("IR: " + ir);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("Total de Descontos: " + descontos);
		
		System.out.println("Seu salário líquido é de: R$" + salarioLiquido + " reais");

		
	}

}
