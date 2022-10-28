package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {
        
        String pasta = "c:\\Users\\Leona\\Documents\\test.txt";
        BufferedReader br = null;
        FileReader fr = null;

        try {

            fr = new FileReader(pasta); // serve para criar um leitos de um caminho especifico
            br = new BufferedReader(fr); 

            String line = br.readLine(); // serve para ler cada linha de um arquivo indicado no BR

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        }
        catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (br != null) {
                    br.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }

        }

    }


}