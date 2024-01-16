import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        double x = 10.307754;
        String nome = "slayer";
        int fund = 1982;
        double renda = 10000.23;
        System.out.printf("%.2f%n", x);
        System.out.printf("%s formou em %d e ganha anualmente %.1f%n",nome,fund,renda);



    }
}
