package inheritance01.entities;

public class Individual extends Contributor {
    private double healthExpenditures;

    public Individual(String name, Double income, Double healthExpenditures) {
        super(name, income);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double income = getIncome();
        double taxPercent = 0.15;

        if (income >= 20000) {
            taxPercent = 0.25;
        }

        double totalTax = income * taxPercent;

        totalTax -= (healthExpenditures * 0.5);

        return totalTax;
    }
}
