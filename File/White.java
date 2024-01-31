package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class White {
    public static void main(String[] args){
        String [] lines = new String[]{"Good morning", "Good afternoom", "Good nigth"};
        String path = "C:\\Users\\guims\\OneDrive\\Desktop\\teste2.txt";
        //append: true, significa que vai adicionar e nao sobreescrever
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for( String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
