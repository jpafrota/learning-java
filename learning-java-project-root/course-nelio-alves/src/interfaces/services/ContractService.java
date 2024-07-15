package interfaces.services;


import interfaces.Contract;
import interfaces.Installment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContractService {

    private final PaymentService paymentService;

    // Dependency injection. Take out the responsibility of instantiating the proper implementation
    public ContractService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, Integer installments) {
        double installmentBasePrice = contract.getTotalValue() / (double) installments;
        List<Installment> installmentList = new ArrayList<>();
        LocalDate baseDate = contract.getDate();

        for (int i = 1; i <= installments; i++) {
            double fee = paymentService.paymentFee(installmentBasePrice);
            double interest = paymentService.interest(installmentBasePrice + fee, i);

            double finalPrice = installmentBasePrice + fee + interest;

            baseDate = baseDate.plusMonths(1);

            installmentList.add(new Installment(baseDate, finalPrice));
        }

        contract.setInstallmentList(installmentList);
    }
}
