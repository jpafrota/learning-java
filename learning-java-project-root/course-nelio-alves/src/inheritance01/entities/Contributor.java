package inheritance01.entities;

public abstract class Contributor {

    private String name;
    private Double income;

    public Contributor(String name, Double income) {
        this.name = name;
        this.income = income;
    }

    public abstract double tax();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }
}
