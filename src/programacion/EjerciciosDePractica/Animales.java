
package programacion.EjerciciosDePractica;

import java.util.Vector;

public class Animales {

    String nombre;
    int edad;
    String especie;
    String raza;
    Vector<Perro> vectorPerro;
    Vector<Gato> vectorGato;
    

    public Animales(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        vectorPerro = new Vector<Perro>();
        vectorGato = new Vector<Gato>();
    }

    public Animales() {

    }

    public void comer() {
        System.out.println("Estoy comiendo");
    }

    public boolean addPerro(String nombre, int edad, String especie, String raza) {
        Perro perro1 = new Perro(nombre, edad, especie, raza);
        vectorPerro.add(perro1);
        return true;
    }

    public void muestroVector(){

        for(int i = 0; i < vectorPerro.size(); i++){
            System.out.println(vectorPerro.elementAt(i));
        }
    }
    
}
