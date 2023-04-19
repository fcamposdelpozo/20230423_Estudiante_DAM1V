
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ficheros_Ejercicio2_main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        FileWriter out = null;

        try{
            out = new FileWriter("C:\\Users\\Alvaro\\OneDrive\\Escritorio\\EjemploDocumentoTexto.txt");
            System.out.println("Introduzca el texto que quiere añadir al fichero.");
            out.write("\n");
            String frase = in.nextLine();
            char caracter;
            for (int i = 0; i < frase.length(); i++){
                caracter = frase.charAt(i);
                out.write(caracter);
            }
        }catch(FileNotFoundException exc){
            System.out.println("ERROR! Fichero no encontrado.");
            exc.printStackTrace();
        }catch(IOException exc){
            System.out.println("ERROR! Hubo un problema al leer el fichero.");
            exc.printStackTrace();
        }finally{
            try{
                out.close();
            }catch(IOException exc){
                exc.printStackTrace();
            }
        }
    }
}
