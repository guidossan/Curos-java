package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class fixacao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the folder path");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        String linha = "";
        String pathFile = path.getPath();
        String name;
        double price;
        Integer quantity ;
        final ArrayList<Product> produtos = new ArrayList<>();
        try (BufferedReader bf = new BufferedReader(new FileReader(pathFile));){
    
            while((linha = bf.readLine()) != null){
                String[] line = linha.split(",",3);
                name = line[line.length-3];
                price = Double.parseDouble(line[line.length-2]);
                quantity = Integer.parseInt(line[line.length-1]);
                Product produto = new Product(name, price, quantity);
                System.out.println(produto);
                produtos.add(produto);
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathFile+"Output.csv"))){
                    for(Product lines : produtos){
                        bw.write(lines.toString());;
                        bw.newLine();
                    }
                }
                
                
            }
            System.out.println(produtos);
        
        }
    

        catch (IOException e){ 
            System.out.println("Error"+ e.getMessage());
        }
        
    }
    
}
