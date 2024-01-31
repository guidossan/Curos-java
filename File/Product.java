package File;

public class Product {
    private String name;
    private double value;
    private Integer quantity;
    public Product(String name, double value, Integer quantity) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }
    public double getFinalPrice(double value){
        return value * quantity;
    }

    
    @Override
    public String toString() {
        return "name=" + name + ", Final value=" + getFinalPrice(value) ;
    }
    public String getName() {
        return name;
    }
    public double getValue() {
        return value;
    }

    public Integer getQuantity() {
        return quantity;
    }

    
    
}
