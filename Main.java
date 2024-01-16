import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);

        String nome = "slayer";
        int fund = 1982;
        double renda = 10000.23;

        System.out.printf("%s formou em %d e ganha anualmente %.1f%n",nome,fund,renda);
        // switch - case
        Scanner sc = new Scanner(System.in);
        String dia;
        int x = sc.nextInt();
        switch (x){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terca";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "Valor invalido";
                break;
        }
        System.out.println("Dia da semana: "+ dia);

        //ternario
        double preco = 35.5;
        //                  se isso         isso        se nao
        double desconto = (preco < 20) ? preco *0.1 : preco*0.05;
        System.out.println(desconto);
    }
}
