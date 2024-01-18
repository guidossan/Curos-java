import java.sql.SQLOutput;

public class Product {
    String name;
    double price;
    int quantity;
    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts (int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return name
                + ", $"+
                String.format("%.2f",price)+
                ", Quantity "+
                quantity+
                " units, Total: $"+
                String.format("%.2f", totalValueInStock());
    }
}
