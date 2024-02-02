package Interface;
import java.util.Scanner;
import java.text.DateTimeFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Program {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Enter data of contract:");
        System.out.print("Number:");
        int number = sc.nextInt();
        System.out.print("Data (dd/mm/yyyy): ");
        LocalDate localDate = LocalDate.parse(sc.next(),fmt);
        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();
        Contract contract = new Contract(number, localDate, totalValue);
        System.out.print("Enter total installments: ");
        int installment = sc.nextInt();
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, installment);

        System.out.println("Parcelas: ");

        for (Installment installment2 : contract.getInstallments()){
            System.out.print(installment2);
            System.out.println();
        }
    }
}
