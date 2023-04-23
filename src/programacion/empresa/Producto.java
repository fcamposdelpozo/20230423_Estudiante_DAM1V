package programacion.empresa;

import java.time.LocalDate;

// Las clases y los ficheros java son UpperCammelCase
public abstract class Producto {
    String nombre;
    String fechaCaducidad; // Intenta utilizar LocalDate para las fechas
    int numeroLote;
    String fechaEnvasado; // Intenta utilizar LocalDate para las fechas
    String paisOrigen;

    public Producto(String nombre, String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String toString() {
        return "Nombre: " + nombre + " /Fecha Caducidad: " + fechaCaducidad + " /Numero de Lote: " + numeroLote + 
            " /Fecha de Envasado: " + fechaEnvasado + " /Pais de Origen: " + paisOrigen;
    }

    public abstract String toCsvLine();
}
