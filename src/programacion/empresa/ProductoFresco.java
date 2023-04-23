package programacion.empresa;

public class ProductoFresco extends Producto {
  public static final String CSV_NOMBRE_FICHERO = "ProductosFrescos.csv";

    public ProductoFresco(String nombre, String fechaCaducidad, int numeroLote, String fechaEnvasado,
            String paisOrigen) {
        super(nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
    }

    public String toString() {
        return super.toString();
    }

    public String toCsvLine() {
        return nombre + "," + fechaCaducidad + "," + numeroLote + "," + fechaEnvasado + "," + paisOrigen;
    }

    public static String csvHeader() {
        return "nombre,fechaCaducidad,numeroLote,fechaEnvasado,paisOrigen";
    }
}
