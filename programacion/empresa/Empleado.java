package programacion.empresa;
public class Empleado {

    private String nombre;
    private String departamento;
    private int edad;
    private double salario;

    public Empleado(String nombre, String departamento, int edad, double salario){
        this.nombre = nombre;
        this.departamento = departamento;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado(){
        
    }

    public String toString (){
        String cadena;
        // cadena = "Nombre: " + nombre + ".\nDepartamento: " + departamento + ".\nEdad: " + edad + ".\nSalario: " + salario;
        // cadena = nombre + ", " + departamento + ", " + edad + ", " + salario;
        cadena = String.format("%10s, %15s, %3d, %.2f", nombre, departamento, edad, salario);
        return cadena;
    } 

}
