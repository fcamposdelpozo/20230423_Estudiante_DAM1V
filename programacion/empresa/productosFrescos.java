package programacion.empresa;

public class productosFrescos extends empresaAlimentaria {
    String fechaEnvasado;
    String paisDeOrigen;

    public productosFrescos(String fechaEnvasado, String paisDeOrigen, String fechaDeCaducidad, int numeroDeLote){
        super(fechaDeCaducidad, numeroDeLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisDeOrigen = paisDeOrigen;
    }

    public String toString(){
        return "Fecha Envasado: " + fechaEnvasado + "\n" + 
        "Pais de Origen: " + paisDeOrigen + "\n" + 
        "Fecha de caducidad: " + fechaDeCaducidad + "\n" + 
        "Numero de Lote: " + numeroDeLote;
    }
}
