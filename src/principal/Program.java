package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {
        
        String pasta = "c:\\Users\\Leona\\Documents\\test.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(pasta))) {

         

            String line = br.readLine(); // serve para ler cada linha de um arquivo indicado no BR

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        }
        catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    

    }


}