package inheritance01;

import inheritance01.entities.Company;
import inheritance01.entities.Contributor;
import inheritance01.entities.Individual;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of contributors: ");
        int numberOfContributors = sc.nextInt();
        sc.nextLine();

        List<Contributor> list = new ArrayList<>();

        for (int i = 0; i < numberOfContributors; i++) {

            System.out.print("Company or individual? (i/c): ");
            String contributorType = sc.nextLine();

            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Income: ");
            double income = sc.nextDouble();

            switch (contributorType) {
                case "i":
                    System.out.println("Health expenditures: ");
                    double healthExpenditures = sc.nextDouble();
                    sc.nextLine();
                    list.add(new Individual(name, income, healthExpenditures));
                    break;
                case "c":
                    System.out.println("Number of employees");
                    int numberOfEmployees = sc.nextInt();
                    sc.nextLine();
                    list.add(new Company(name, income, numberOfEmployees));
                    break;
                default:
            }
        }

        for (Contributor contributor : list) {
            System.out.println(contributor.getName() + ": $" + contributor.tax());
        }

    }
}
