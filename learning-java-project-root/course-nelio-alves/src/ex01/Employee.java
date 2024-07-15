package ex01;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalaryByPercent(double percent) {
        this.salary *= (1 + percent/100);
    }

    public double getSalary() {
        return this.salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id: "
                + this.id
                + "\nName: "
                + this.name
                + "\nSalary: R$"
                + this.salary;
    }
}
