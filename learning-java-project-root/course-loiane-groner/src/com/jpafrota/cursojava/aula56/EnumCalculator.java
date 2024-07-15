package com.jpafrota.cursojava.aula56;

public enum EnumCalculator {
    SOMA("+") {
        @Override
        public double executaOperacao(double x, double y) {
            return x + y;
        }
    },
    SUBTRACAO("-") {
        @Override
        public double executaOperacao(double x, double y) {
            return x - y;
        }
    },
    MULTIPLICACAO("*") {
        @Override
        public double executaOperacao(double x, double y) {
            return x * y;
        }
    },
    DIVISAO("/") {
        @Override
        public double executaOperacao(double x, double y) {
            return x / y;
        }
    };

    private final String operador;

    EnumCalculator(String operador) {
        this.operador = operador;
    }

    public String getOperador() {
        return operador;
    }

    public abstract double executaOperacao(double x, double y);

    @Override
    public String toString() {
        return "EnumCalculator{" +
                "operador='" + operador + '\'' +
                '}';
    }
}
