package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class Program{
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Tablet", 850.00));
        list.add(new Product("Mouse", 50.50));
        list.add(new Product("HD Case", 500.89));

        productService ps = new productService();
        double sum = ps.filteredSum(list, p -> p.getPrice() < 100.0);
        System.out.println("Sum = " + String.format("%.2f", sum));
        /*
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        names.forEach(System.out::println);
        */
    }
}