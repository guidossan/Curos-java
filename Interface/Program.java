package Interface;
import java.util.Scanner;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Program {
    Locale.setDefault(Locale.US);
    Scanner sc =new Scanner(System.in);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    System.out.println("Enter data of contract:");
    System.out.print("Number:");
    int number = sc.nextInt();
    System.out.print("Data (dd/mm/yyyy): ");
    LocalDate localDate = LocalDate.parse(sc.nextLine(),fmt);
    System.out.print("Contract value: ");
    double totalValue = sc.nextDouble();
    Contract contract = new Contract(number, localDate, totalValue);
    System.out.print("Enter total installments: ");
    int installment = sc.nextInt();
    ContractService contractService = new ContractService(null);
    contractService.processContract(contract, installment);

    System.out.print("Parcelas: ");

    for (Installment installment : contract.getInstallments){
        System.out.print(installment);
    }
}
