import java.util.Locale;
import java.util.Scanner;

public class Retangle {
    double width;
    double height;
    public Retangle(){

    }
    public double area(){
        return width * height;
    }
    public double perimeter(){
        return (width+height)*2;
    }
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        Retangle retangle = new Retangle();
        System.out.println("Enter retangle width and heigth: ");
        retangle.width = sc.nextDouble();
        retangle.height = sc.nextDouble();
        System.out.println(retangle.area());
        System.out.println(retangle.perimeter());

    }
}
