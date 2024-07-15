package interfaces;

import java.time.LocalDate;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDate date;
    private Double totalValue;
    private List<Installment> installmentList;

    public Contract(Integer number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
        this.installmentList = null;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setInstallmentList(List<Installment> installmentList) {
        this.installmentList = installmentList;
    }

    public List<Installment> getInstallmentList() {
        return installmentList;
    }
}
