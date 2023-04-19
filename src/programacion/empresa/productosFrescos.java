package programacion.empresa;

import java.io.FileWriter;
import java.io.IOException;

public class productosFrescos extends producto {
    String paisDeOrigen;

    public productosFrescos(String nombre, String fechaEnvasado, String paisDeOrigen, String fechaDeCaducidad,
            int numeroDeLote) {
        super(nombre, fechaDeCaducidad, numeroDeLote);
        this.paisDeOrigen = paisDeOrigen;
    }

    public productosFrescos() {

    }

    public void setDatosProducto(String fechaEnvasado, String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Pais de Origen: " + paisDeOrigen + "\n" +
                "Fecha de caducidad: " + fechaDeCaducidad + "\n" +
                "Numero de Lote: " + numeroDeLote;
    }

    public void ingresarEnDisco() throws IOException {
        FileWriter escribir = null;
        
        try{
            escribir = new FileWriter("C:\\Users\\Alvaro\\OneDrive\\Escritorio\\documentoPrueba.txt");
            escribir.write(toString());
        }catch(IOException exc){
            System.out.println("Fichero no encontrado");
        }finally{
            escribir.close();
        }
    }
}
