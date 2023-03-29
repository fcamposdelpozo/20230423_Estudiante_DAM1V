package programacion.EjerciciosDePractica;

public class Vecino extends Persona {
    private String codVecino;
    private String codVivienda;
    private String finca;
    private static double cuota;

    public Vecino(){

    }

    public Vecino (String codVecino, String codVivienda, String finca, String nombre, String dni, int edad){
        super(nombre, edad, dni);
        this.codVecino = codVecino;
        this.codVivienda = codVivienda;
        this.finca = finca;
    }

    public boolean codigoValido(){

        if (codVecino.length() > 5){
            return false;
        }

        if (codVecino.substring(0, 0).equals("V")){
            return false;
        }

        return true;
    }

    public static void valorCuota (double cuota){
        
    }

    public String toString(){
        return "****DATOS DE VECINO****\n" + 
            "Nombre: " + nombre + "\n" + 
            "DNI: " + dni + "\n" + 
            "Edad: " + edad + "\n" +
            "Codigo de Vecino: " + codVecino + "\n" + 
            "Codigo de Vivienda: " + codVivienda + "\n" + 
            "Nombre de Finca: " + finca + "\n";
    }
}


    
