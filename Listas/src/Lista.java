import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        ArrayList<Employeer> lista = new ArrayList<Employeer>();
        System.out.println("How many employees be registered? ");
        int n = sc.nextInt();


        for (int i=0; i<n; i++) {
            System.out.println("Emplyeer"+(i+1)+": ");
            System.out.println("ID: ");
            int id = sc.nextInt();
            System.out.println("Name: ");
            String nome = sc.next();
            System.out.println("Salary: ");
            Double salario = sc.nextDouble();
            Employeer employeer = new Employeer(id, nome, salario);
            lista.add(employeer);
        }
        System.out.println("--Antes--");
        for(Employeer obj: lista){
            System.out.println(obj.toString());
        }
        System.out.println("Enter the employeer id that will have salary increase:");
        int employeerID = sc.nextInt();
        System.out.println("Enter the percentage:");
        Double employeerPER = sc.nextDouble();

        for(Employeer obj: lista){
            if (obj.getId() == employeerID){
                obj.aumento(employeerPER);
            }
        }

        System.out.println("--Depois--");
        for(Employeer obj: lista){
            System.out.println(obj.toString());
        }
        sc.close();
    }
}
