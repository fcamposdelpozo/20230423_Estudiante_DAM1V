package programacion.EjerciciosDePractica;

public class Trabajador extends Persona {
    int categoriaProfesional;
    int antigüedad;

    public Trabajador(){

    }

    public Trabajador(String nombre, String telefono, int edad, int categoriaProfesional, int antigüedad){
        super(nombre, telefono, antigüedad);
        this.antigüedad = antigüedad;
        this.categoriaProfesional = categoriaProfesional;
    }

    public String toString(){
        return "Nombre: " + nombre + "\n" +
        "Telefono: " + telefono + "\n" + 
        "Edad: " + edad + "\n" + 
        "Categoria Profesional: " + categoriaProfesional + "\n" +
        "Antigüedad: " + antigüedad;
    }
}
