package programacion.empresa;

public class ProductoRefrigerado extends Producto {
    String codigoOrganismo;
    int temperaturaMantenimiento;
  public static final String CSV_NOMBRE_FICHERO = "ProductosRefrigerados.csv";


    public ProductoRefrigerado(String nombre, String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, String codigoOrganismo, int temperaturaMantenimiento){
        super(nombre, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
        this.codigoOrganismo = codigoOrganismo;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    public String toString() {
        return super.toString() + " /Codigo Organismo: " + codigoOrganismo + " /Temperatura de Mantenimiento Recomendada: " + temperaturaMantenimiento;
    }

    public String toCsvLine() {
        return nombre + "," + fechaCaducidad + "," + numeroLote + "," + fechaEnvasado + "," + paisOrigen + "," + codigoOrganismo + "," + temperaturaMantenimiento;
    }

    public static String csvHeader() {
        return "nombre,fechaCaducidad,numeroLote,fechaEnvasado,paisOrigen,CodigoOrganismo,temperaturaMantenimiento";
    }
}
