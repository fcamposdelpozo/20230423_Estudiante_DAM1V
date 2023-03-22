package programacion.EjerciciosDePractica;

public class Persona {

    protected String nombre;
    protected String telefono;
    protected int edad;

    public Persona(){

    }

    public Persona(String nombre, String telefono, int edad){
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
    }

    public boolean comprobarPersona(){
        if(nombre.isEmpty()){
            return false;
        }

        if(telefono.isEmpty()){
            return false;
        }

        if(edad < 0 || edad > 125){
            return false;
        }

        return true;
    }

    public String toString(){
        return "Nombre: " + nombre + "\n" +
                "Telefono: " + telefono + "\n" + 
                "Edad: " + edad;
    }

}
