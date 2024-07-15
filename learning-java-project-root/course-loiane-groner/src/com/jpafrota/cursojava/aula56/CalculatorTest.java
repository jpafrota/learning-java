package com.jpafrota.cursojava.aula56;

public class CalculatorTest {
    public static void main(String[] args) {
        for (EnumCalculator operation : EnumCalculator.values()) {
            System.out.println(operation.toString() + " " + operation.executaOperacao(2, 2));
        }

    }
}
