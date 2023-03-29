package programacion.empresa;

public class Automovil extends Vehiculo {

    private int puertas;

    public Automovil(String marca, String modelo, int anio, int puertas){
        super(marca, modelo, anio);
        this.puertas = puertas;
    }

    public String toString(){
        return "****AUTOMOVIL****\n" + 
        "-Marca: " + marca + "\n" + 
        "-Modelo: " + modelo + "\n" + 
        "-Año: " + anio + "\n" + 
        "-Puertas: " + puertas;
    }

    public boolean validoParametros(){
        if(anio < 1900){
            return false;
        }

        return true;
    }
}
