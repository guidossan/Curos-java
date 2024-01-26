package fixacaoTryCatch;



import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter the data account: ");
			Integer number = sc.nextInt();
			System.out.print("Hold: ");
            sc.next();
			String hold = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();

            Acount account = new Acount(number, hold, balance, withdrawLimit);
			System.out.println("Balance"+account);
			
			System.out.println();
			System.out.println("Enter withdraw amount:");
            double withdraw = sc.nextDouble();
			account.withdraw(withdraw);
			System.out.println("New balance: " + account);
		}
        catch (Exception e){
            System.out.println("Error to withdraw: "+e.getMessage());
        }
		

		sc.close();
	}
}
