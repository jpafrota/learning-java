package inheritance01.entities;

public class Company extends Contributor {
    private int numberOfEmployees;

    public Company(String name, Double income, Integer numberOfEmployees) {
        super(name, income);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {

        double income = getIncome();
        double taxPercent = 0.16;

        if (numberOfEmployees > 10) taxPercent = 0.14;

        double totalTax = income + taxPercent;

        return totalTax;
    }
}
