package sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        int qtd;
        System.out.println("Course A students qtd: ");
        qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            set.add(sc.nextInt());
        }

        System.out.println("Course B students qtd: ");
        qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            set.add(sc.nextInt());
        }

        System.out.println("Course C students qtd: ");
        qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            set.add(sc.nextInt());
        }

        System.out.println("Students: " + set.size());
    }
}
