package Interface;

public interface OnlinePaymentAService {
    double paymentFee(double amount);
    double interest(double amount, double months);
} 