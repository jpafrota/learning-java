package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeesList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many employees to read: ");
        int readQt = sc.nextInt();

        // Read employees
        for (int i = 0; i < readQt; i++) {
            int id;
            String name;
            double salary;

            System.out.println("Employee #" + (i+1) + ": ");
            System.out.println("ID: ");
            id = sc.nextInt();
            while (hasId(employeesList, id)) {
                System.out.println("ID already taken. Please try again.");
                id = sc.nextInt();
            }

            System.out.println("Name: ");
            sc.nextLine();
            name = sc.nextLine();

            System.out.println("Salary: ");
            salary = sc.nextDouble();

            employeesList.add(new Employee(id, name, salary));
        }

        System.out.println("Enter the employee's ID that will have the salary increase: ");
        int targetId = sc.nextInt();
        System.out.println("Enter the percentage: ");
        double increasePercent = sc.nextDouble();

        Employee emp = employeesList.stream().filter(x -> x.getId() == targetId).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.println("Found employee!");
            emp.increaseSalaryByPercent(increasePercent);
        }

        System.out.println("List of employees: ");
        System.out.println("------------------");
        for (Employee employee : employeesList) {
            System.out.println(employee.toString());
            System.out.println("------------------");
        }

    }

    public static boolean hasId(List<Employee> list, int id) {
        return list.stream().anyMatch(x -> x.getId() == id);
    }
}
