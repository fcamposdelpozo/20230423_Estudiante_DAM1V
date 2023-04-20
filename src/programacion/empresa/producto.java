package programacion.empresa;

import java.time.LocalDate;

public abstract class producto {
    String nombre;
    String fechaCaducidad;
    int numeroLote;
    String fechaEnvasado;
    String paisOrigen;

    public producto(String nombre, String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
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
