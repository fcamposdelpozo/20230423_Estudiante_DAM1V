import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ficheros_Ejercicio1_main {
    public static void main(String[] args) {

        FileReader in = null;

        try{
            in = new FileReader("C:\\Users\\Alvaro\\OneDrive\\Escritorio\\EjemploDocumentoTexto.txt");
            int numeroLetras = 0;
            numeroLetras = in.read();
            while(numeroLetras != -1){
                System.out.print((char)numeroLetras);
                numeroLetras =  in.read();
            }
        }catch(FileNotFoundException exc){
            System.out.println("Fichero no encontrado.");
            exc.printStackTrace();
        }catch(IOException exc){
            System.out.println("Error en la lectura del fichero.");
            exc.printStackTrace();
        }finally {
            try{
                in.close();
            } catch (IOException exc){
                exc.printStackTrace();
            }
        }
    }
}
