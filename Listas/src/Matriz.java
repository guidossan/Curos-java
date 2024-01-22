import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);

        System.out.println("How many employees be registered? ");
        int n = sc.nextInt();
        int [][] mat = new int[n][n];
        for (int i =0; i<n; i++){
            for (int j = 0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("main diagonal");
        for (int i=0; i<n; i++){
            System.out.println(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i =0; i<n; i++){
            for (int j = 0; j<n; j++){
                if (mat[i][j]<0){
                    count ++;
                }
            }
        }
        System.out.println("Negative numbers: "+count);
    }
}
