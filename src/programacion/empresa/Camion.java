package programacion.empresa;

public class Camion extends Vehiculo {
    
    private double capacidadCarga;

    public Camion(String marca, String modelo, int anio, double capacidadCarga){
        super(marca, modelo, anio);
        this.capacidadCarga = capacidadCarga;
    }

public String toString(){
    return "****CAMION****\n" + 
        "-Marca: " + marca + "\n" + 
        "-Modelo: " + modelo + "\n" + 
        "-Año: " + anio + "\n" +
        "-Capacidad de carga: " + capacidadCarga;
}
}
