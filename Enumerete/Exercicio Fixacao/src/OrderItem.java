import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private int quatity;
    private double price;
    private Product product;

    public OrderItem(int quatity, double price, Product product) {
        this.quatity = quatity;
        this.price = price;
        this.product=product;
    }


    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
