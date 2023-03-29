package programacion.EjerciciosDePractica;

public class Alumno {

    private String nombre;
    private String sexo;
    private int edad;
    

    public Alumno(String nombre, String sexo, int edad){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public Alumno(){

    }

    public String setNombre(String nombre){
        this.nombre = nombre;
        return nombre;
    }

    public String setSexo(String sexo){
        this.sexo = sexo;
        return sexo;
    }

    public int setEdad(int edad){
        this.edad = edad;
        return edad;
    }

    public String toString(){
        return "Nombre: " + nombre + "\n" +
        "Sexo: " + sexo + "\n" + 
        "Edad: " + edad;
    }

}
