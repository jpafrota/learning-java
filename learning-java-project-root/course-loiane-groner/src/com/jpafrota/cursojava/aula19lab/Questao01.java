package com.jpafrota.cursojava.aula19lab;

import java.util.ArrayList;
import java.util.List;

public class Questao01 {

	public static void main(String[] args) {

		int[] A = new int[5];
		
		for(int i = 0; i < 5; i++) {
			A[i] = i+1;
		}

		ArrayList<Integer> list = new ArrayList<>();
		processList(list);

		int[] B = new int[5];
		
		for(int i = 0; i < 5; i++) {
			B[i] = A[i];
		}
		
		for(int aux : A) {
			System.out.print(aux);
		}
		
		System.out.println();
		
		for(int aux : B) {
			System.out.print(aux);
		}
		
	}

	public static void processList(List<Integer> list) {
		list.add(3);
		System.out.println(list);
	}

}
