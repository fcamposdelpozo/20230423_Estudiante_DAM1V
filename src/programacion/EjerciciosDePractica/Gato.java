package programacion.EjerciciosDePractica;

public class Gato extends Animales {

    private String pelaje;

    public Gato(String nombre, int edad, String especie, String pelaje){
        super(nombre, edad, especie);
        this.pelaje = pelaje;
    }

    public void maullar(){
        System.out.println("Miau, miau");
    }

    public String toString(){
        return "Datos del gato:\n" 
        + "Nombre: " + nombre 
        + "\nEdad: " + edad 
        + "\nEspecie: " + especie
        + "\nPelaje: " + pelaje;
    }
}
