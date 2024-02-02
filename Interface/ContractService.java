package Interface;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentAService onlinePaymentAService;

    public ContractService(OnlinePaymentAService onlinePaymentAService) {
        this.onlinePaymentAService = onlinePaymentAService;
    } 

    public void processContract(Contract contract, int mounts){
        double basicValue = contract.getTotalValue() / mounts;
        for (int i=1 ; i<=mounts; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentAService.interest(basicValue, i);
            double fee = onlinePaymentAService.paymentFee(basicValue + interest);
            double quote = basicValue + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, quote));
        }

    }
}
