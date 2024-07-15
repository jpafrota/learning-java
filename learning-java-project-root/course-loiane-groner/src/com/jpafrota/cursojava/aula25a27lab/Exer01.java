package com.jpafrota.cursojava.aula25a27lab;

public class Exer01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		
		lampada.modelo = "A30";
		lampada.potencia = 18;
		lampada.tensao = 220;
		lampada.tipoIluminacao = "LED";
		lampada.corDaLuz = "RGB";
		
		System.out.println("Modelo: " + lampada.modelo);
		System.out.println("Potência: " + lampada.potencia);
		System.out.println("Tensão: " + lampada.tensao);
		System.out.println("Tipo de Iluminação: " + lampada.tipoIluminacao);
		System.out.println("Cor da Luz: " + lampada.corDaLuz);
		
		System.out.println("Lâmpada ligada: " + lampada.ligado);
		lampada.interruptor();
		System.out.println("Lâmpada ligada: " + lampada.ligado);
		lampada.interruptor();
		System.out.println("Lâmpada ligada: " + lampada.ligado);
		lampada.ligar();
		System.out.println("Lâmpada ligada: " + lampada.ligado);
		lampada.ligar();
		System.out.println("Lâmpada ligada: " + lampada.ligado);
		lampada.desligar();
		System.out.println("Lâmpada ligada: " + lampada.ligado);
		
	}

}
