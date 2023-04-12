package programacion.empresa;

public class SocioPolizas {

    private String nombre;
    private String dni;
    private int edad;

    public SocioPolizas(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public boolean esEdadValida() {
        if (edad < 18 || edad > 64) {
            return false;
        }
        return true;
    }

    public boolean datosCorrectos(){
        if (nombre.length() < 1 || nombre.length() > 20){
            return false;
        }

        if (dni.length() != 9){
            return false;
        }

        return true;
    }

    public String toString(){
        return "Nombre: " + nombre + "\n" + 
            "DNI: " + dni + "\n" + 
            "Edad: " + edad;
    }
}
