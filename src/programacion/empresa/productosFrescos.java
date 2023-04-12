package programacion.empresa;

public class productosFrescos extends producto {
    String paisDeOrigen;

    public productosFrescos(String nombre, String fechaEnvasado, String paisDeOrigen, String fechaDeCaducidad, int numeroDeLote){
        super(nombre, fechaDeCaducidad, numeroDeLote);
        this.paisDeOrigen = paisDeOrigen;
    }

    public productosFrescos(){

    }

    

    public void setDatosProducto(String fechaEnvasado, String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public String toString(){
        return "Nombre: " + nombre + "\n" + 
        "Pais de Origen: " + paisDeOrigen + "\n" + 
        "Fecha de caducidad: " + fechaDeCaducidad + "\n" + 
        "Numero de Lote: " + numeroDeLote;
    }
}
