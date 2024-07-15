package interfaces;

import java.time.LocalDate;

public class Installment {
    private LocalDate dueDate;
    private Double amount;

    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return dueDate.toString() + " - R$" + amount;
    }
}
