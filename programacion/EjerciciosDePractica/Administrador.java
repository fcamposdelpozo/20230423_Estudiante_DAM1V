package programacion.EjerciciosDePractica;

public class Administrador extends Persona {
    private String codAdministrador;
    private String finca;
    private int numVecinos;
    private float salario;

    public Administrador(){

    }

    public Administrador(String codAdministrador, String finca, int numVecinos, String nombre, String dni, int edad){
        super(nombre, edad, dni);
        this.codAdministrador = codAdministrador;
        this.finca = finca;
        this.numVecinos = numVecinos;
    }

    public boolean codigoValido(){
        if(codAdministrador.length() != 5){
            return false;
        }

        if(codAdministrador.substring(1, 1) != "A"){
            return false;
        }

        return true;
    }

    public double salarioMaximo (float cuota){
        double salario;

        salario = (numVecinos * cuota)*0.5;

        return salario;
    }

    public String toString(){

        return "****ADMINISTRADOR****\n" + 
        "Codigo de administrador: " + codAdministrador + "\n" +
        "Finca en que trabaja: " + finca + "\n" +
        "Numero de vecinos en la finca: " + numVecinos + "\n" +
        "Salario: " + salario; 
        
    }
}
