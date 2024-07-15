package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o valor da sua hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.print("Entre com a quantidade de horas trabalhadas no mês: ");
		double horasTrab = scan.nextDouble();
		
		double salarioBruto = horasTrab * valorHora;
		
		double ir;
		double inss = salarioBruto * (10d/100d);
		double fgts = salarioBruto * (11d/100d);
		double salarioLiq;
		
		if(salarioBruto <= 900) {
			ir = 0;
		}
		else if(salarioBruto <= 1500) {
			ir = salarioBruto * (5d/100d);
		}
		else if(salarioBruto <= 2500) {
			ir = salarioBruto * (10d/100d);
		}
		else {
			ir = salarioBruto * (20d/100d);
		}
		
		salarioLiq = salarioBruto - ir - inss;
		
		System.out.println("salário Bruto: (" + valorHora + " + " + horasTrab + "): R$" + salarioBruto);
		System.out.println("(-) IR (" + (ir * 100d)/salarioBruto + "%): R$" + ir);
		System.out.println("(-) INSS (10%): R$" + inss);
		System.out.println("FGTS (11%): R$" + fgts);
		System.out.println("Total de Descontos: R$" + (ir + inss));
		System.out.println("salário líquido: R$" + salarioLiq);
		
	}
}
