import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);



        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Price");
        double price = sc.nextDouble();
        System.out.println("Quantity");
        int quantity = sc.nextInt();
        Product product1 = new Product(name, price, quantity);
        System.out.println(product1);
        System.out.println("Enter the quantity add in stock");
        product1.addProducts(sc.nextInt());
        product1.setName("computer");
        System.out.println("Updated name: "+ product1.getName());
        System.out.println("Updated data: "+product1.totalValueInStock());
        sc.close();
    }
}