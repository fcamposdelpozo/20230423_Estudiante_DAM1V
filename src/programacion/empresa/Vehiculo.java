package programacion.empresa;
public class Vehiculo {

    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String toString(){
        return "****VEHICULO****\n" + 
        "-Marca: " + marca + "\n" + 
        "-Modelo: " + modelo + "\n" + 
        "-Año: " + anio;
    }
}
