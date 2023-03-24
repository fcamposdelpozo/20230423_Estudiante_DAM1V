package programacion.EjerciciosDePractica;

import java.text.DecimalFormat;

public class Administrador extends Persona {
    private String codAdministrador;
    private String finca;
    private int numVecinos;
    private double salario;

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

        if(codAdministrador.substring(1, 1).equals("A")){
            return false;
        }

        return true;
    }

    public void setSalarioMaximo (float cuota){

        salario = (numVecinos * cuota)*0.5;

    }

    public double getSalario(){
        return salario;
    }

    public String toString(){
        DecimalFormat formato = new DecimalFormat();

        return "****ADMINISTRADOR****\n" + 
        "Nombre: " + nombre + "\n" + 
        "DNI: " + dni + "\n" + 
        "Edad: " + edad + "\n" +
        "Codigo de administrador: " + codAdministrador + "\n" +
        "Finca en que trabaja: " + finca + "\n" +
        "Numero de vecinos en la finca: " + numVecinos + "\n" +
        "Salario: " + formato.format(getSalario()); 
        
    }
}
