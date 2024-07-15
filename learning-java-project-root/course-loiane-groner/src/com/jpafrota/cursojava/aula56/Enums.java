package com.jpafrota.cursojava.aula56;

/**
 * com.jpafrota.cursojava.aula56.Enums can also be used as whole files. This example uses them inside a class to better illustrate the outputs.
 */
public class Enums {
    enum TipoUsuario {

        // Must always be declared with upper case, since they're constants.
        ALUNO(1, "Aluno"),
        PROFESSOR(2, "Professor"),
        COORDENADOR(3, "Coordenador");

        private final int value;
        private final String name;

        TipoUsuario(int value, String name) {
            this.value = value;
            this.name = name;
        }

        public int getValue() {
            return value;
        }

        public String getName() {
            return name;
        }

    }

    public static void main(String[] args) {
        for (TipoUsuario tipo : TipoUsuario.values()) {
            System.out.println(tipo.getValue() + " " + tipo.getName() + "\n");
        }
    }
}
