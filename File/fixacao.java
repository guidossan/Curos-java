package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fixacao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the folder path");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        String linha = "";
        String pathFile = path.getPath();
        try (BufferedReader bf = new BufferedReader(new FileReader(pathFile));){
    
            while((linha = bf.readLine()) != null){
                String line = sc.nextLine();
                System.out.println(line);
                
            }

        
        }
        catch (IOException e){ 
            System.out.println("Error"+ e.getMessage());
        }
        
    }
    
}
