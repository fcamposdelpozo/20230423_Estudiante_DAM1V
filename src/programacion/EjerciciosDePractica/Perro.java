package programacion.EjerciciosDePractica;

public class Perro extends Animales {

    private String raza;  
    
    public Perro(String nombre, int edad, String especie, String raza){
        super(nombre, edad, especie);
        this.raza = raza;
    }

    public void ladrar(){
        System.out.println("Guau, guau");
    }

    public String toString(){
        return "Datos del perro:\n" 
        + "Nombre: " + nombre 
        + "\nEdad: " + edad 
        + "\nEspecie: " + especie
        + "\nRaza: " + raza;
    }

    
}
