package Interface;

public class PaypalService implements OnlinePaymentAService{

    @Override
    public double paymentFee(double amount) {
        return amount * 0.02;
    }

    @Override
    public double interest(double amount, double months) {
        return amount * 0.01 * months;  
    }


}
