import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);

        Product product1 = new Product();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product1.name = sc.nextLine();
        System.out.println("Price");
        product1.price = sc.nextDouble();
        System.out.println("Quantity");
        product1.quantity = sc.nextInt();

        System.out.println(product1);
        System.out.println("Enter the quantity add in stock");
        product1.addProducts(sc.nextInt());
        System.out.println("Updated data: "+product1.totalValueInStock());
        sc.close();
    }
}