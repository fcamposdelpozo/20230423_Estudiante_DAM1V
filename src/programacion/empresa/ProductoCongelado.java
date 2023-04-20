package programacion.empresa;

import java.time.LocalDate;

public class ProductoCongelado extends producto {
    int temperaturaRecomendada;

    public ProductoCongelado(String nombre, String fechaCaducidad, int numeroLote, String fechaEnvasado,
            String paisOrigen, int temperaturaRecomendada) {
        super(nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public String toString() {
        return "Nombre: " + nombre + " /Fecha Caducidad: " + fechaCaducidad + " /Numero de Lote: " + numeroLote +
                " /Fecha de Envasado: " + fechaEnvasado + " /Pais de Origen: " + paisOrigen
                + " /Temperatura Recomendada: " + temperaturaRecomendada;
    }

    @Override
    public String toCsvLine() {
        return nombre + "," + fechaCaducidad + "," + numeroLote + "," + fechaEnvasado + "," + paisOrigen + ","
                + temperaturaRecomendada;
    }

    public static String csvHeader() {
        return "nombre,fechaCaducidad,numeroLote,fechaEnvasado,paisOrigen,temperaturaRecomendada";
    }

}
