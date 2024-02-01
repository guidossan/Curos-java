package Interface;

public class ContractService {
    private OnlinePaymentAService onlinePaymentAService;

    public ContractService(OnlinePaymentAService onlinePaymentAService) {
        this.onlinePaymentAService = onlinePaymentAService;
    } 

    public void processContract(Contract contract int mounts){
        contract.getInstallments().add(null)
    }
}
