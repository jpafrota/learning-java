package composition;

import composition.entities.Department;
import composition.entities.Employee;
import composition.entities.HourContract;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        Department department = new Department(sc.nextLine());
        System.out.println("Enter employee data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        EmployeeLevel level = EmployeeLevel.valueOf(sc.nextLine());
        System.out.print("Base Salary: ");
        Double baseSalary = sc.nextDouble();

        Employee emp = new Employee(name, department, level, baseSalary);

        System.out.print("How many contracts does this employee have? ");
        int amountOfContracts = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < amountOfContracts; i++) {
            System.out.println("Enter contract #" + (i+1) + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate date = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();
            sc.nextLine();
            emp.addContract(new HourContract(date, valuePerHour, duration));
        }

        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String dateInput = sc.nextLine();
        YearMonth yearMonth = YearMonth.parse(dateInput, DateTimeFormatter.ofPattern("MM/yyyy"));
        LocalDate targetDate = yearMonth.atDay(1);

        System.out.println("Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Total income: " + emp.income(targetDate.getYear(), targetDate.getMonthValue()));

    }
}
