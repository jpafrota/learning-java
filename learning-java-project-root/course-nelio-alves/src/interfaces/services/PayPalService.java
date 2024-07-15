package interfaces.services;

public class PayPalService implements PaymentService {

    public static final double MONTHLY_INTEREST = 0.01;
    public static final double FEE = 0.02;

    @Override
    public Double paymentFee(Double amount) {
        return amount * FEE;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return amount * (months * MONTHLY_INTEREST);
    }
}
