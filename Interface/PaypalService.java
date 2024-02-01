package Interface;

public class PaypalService implements OnlinePaymentAService{

    @Override
    public double paymentFee(double amount) {
        return amount * 0.2;
    }

    @Override
    public double interest(double amount, double months) {
        double rest = amount%months;
        double cash = (amount/months) + rest;
        return (paymentFee(cash) + 0.1) * months; 
    }

}
