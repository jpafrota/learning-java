package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		
		if(num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		while(num1 <= num2) {
			
			System.out.println(num1);
			num1++;
			
		}
		
	}

}
