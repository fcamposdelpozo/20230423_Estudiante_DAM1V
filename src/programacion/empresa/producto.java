
package programacion.empresa;

public abstract class producto {
    String nombre;
    String fechaDeCaducidad;
    int numeroDeLote;
    

    public producto (){

    }

    public producto (String nombre, String fechaDeCaducidad, int numeroDeLote){
        this.nombre = nombre;
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.numeroDeLote = numeroDeLote;
    }

    
    
    public void setDatos(String nombre, String fechaDeCaducidad, int numeroDeLote) {
        this.nombre = nombre;
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.numeroDeLote = numeroDeLote;
    }

    public boolean datosCorrectos (){
        if (nombre.isEmpty()){
            return false;
        }

        if (fechaDeCaducidad.isEmpty()){
            return false;
        }   

        if (numeroDeLote < 50000 || numeroDeLote > 99999){
            return false;
        }

        return true;
    }

    public String toString(){
        return "Nombre: " + nombre + "\n" + 
        "Fecha de caducidad: " + fechaDeCaducidad + "\n" + 
        "Numero de lote: " + numeroDeLote;
    }
}
