package programacion.EjerciciosDePractica;

public abstract class Persona {

    protected String nombre;
    protected String telefono;
    protected int edad;
    protected String dni;
    protected char [] arrayLetras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public Persona(){

    }

    public Persona(String nombre, String telefono, int edad){
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
    }

    public Persona (String nombre, int edad, String dni){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
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

    public boolean esMayorDeEdad(){
        if (edad > 18){
            return true;
        }else{
            return false;
        }
    }

    public boolean dniValido(){
        if (dni.length() != 9){
            return false;
        }

        char letra = dni.charAt(9);
        boolean letraValida = false;

        for(int i = 0; i < arrayLetras.length; i++){
            if (letra == arrayLetras[i]){
                letraValida = true;
                break;
            }
        }

        if(!letraValida){
            return false;
        }

        return true;
    }

}
