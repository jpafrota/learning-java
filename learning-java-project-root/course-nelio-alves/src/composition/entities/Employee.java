package composition.entities;

import composition.EmployeeLevel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    private List<HourContract> contractsList;
    private String name;
    private Department department;
    private EmployeeLevel level;
    private Double baseSalary;

    public Employee(String name, Department department, EmployeeLevel level, Double baseSalary) {
        this.name = name;
        this.department = department;
        this.level = level;
        this.baseSalary = baseSalary;
        this.contractsList = new ArrayList<>();
    }

    public List<HourContract> getContractsList() {
        return contractsList;
    }

    public void addContract(HourContract contract) {
        this.contractsList.add(contract);
    }

    public void removeContract(HourContract contract) {
        this.contractsList.remove(contract);
    }

    public double income(Integer year, Integer month) {

        Double totalIncome = 0.0;
        totalIncome += baseSalary;

        for (HourContract contract : this.contractsList) {
            LocalDate date = contract.getDate();
            if (date.getYear() == year && date.getMonth().getValue() == month) {
                totalIncome += contract.totalValue();
            }
        }

        return totalIncome;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department.getName();
    }

    @Override
    public String toString() {
        return "Name: "
                + name + "\n"
                + "Department: " + "\n"
                + department + "\n"
                + name + "\n";
    }
}
