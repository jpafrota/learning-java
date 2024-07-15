package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tipo de carne desejada: ");
		System.out.println("1 - Filé Duplo\n2 - Alcatra\n3 - Picanha");
		int tipoCarne = scan.nextInt();
		
		String tipo = "Inválido";
		
		System.out.println("Digite a quantidade desejada (em KG): ");
		double quilos = scan.nextDouble();
		
		System.out.println("Como deseja pagar?\n1 - Cartão\n2 - Dinheiro");
		int pagamento = scan.nextInt();
		
		double preco = 0;
		double desconto = 0;
		
		switch (tipoCarne) {
		case 1: 
			tipo = "Filé Duplo";
			if (quilos <= 5)
				preco = 4.9 * quilos;
			else
				preco = 5.8 * quilos;
			break;

		case 2: 
			tipo = "Alcatra";
			if (quilos <= 5)
				preco = 5.9 * quilos;
			else
				preco = 6.8 * quilos;
			break;

		case 3: 
			tipo = "Picanha";
			if (quilos <= 5)
				preco = 6.9 * quilos;
			else
				preco = 7.8 * quilos;
			break;
		}
		
		if(pagamento == 1) desconto = preco * 10/100;
		double precoTotal = preco - desconto;
		
		System.out.println("CUPOM FISCAL\n");
		System.out.println("Tipo de Carne: " + tipo);
		System.out.println("Quantidade: " + quilos + "kg");
		System.out.println("preço: R$" + preco);
		System.out.print("Tipo de Pagamento: ");
		if(pagamento == 1) System.out.println("Cartão");
		else System.out.println("Dinheiro");
		System.out.println("Desconto: R$" + desconto);
		System.out.println("Valor total a pagar: R$" + precoTotal);
		
	}
}
