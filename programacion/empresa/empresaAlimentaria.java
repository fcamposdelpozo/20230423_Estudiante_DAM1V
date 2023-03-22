
package programacion.empresa;

public class empresaAlimentaria {
    String fechaDeCaducidad;
    int numeroDeLote;
    

    public empresaAlimentaria (){

    }

    public empresaAlimentaria (String fechaDeCaducidad, int numeroDeLote){
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.numeroDeLote = numeroDeLote;
    }
    
    public String toString(){
        return "Fecha de caducidad: " + fechaDeCaducidad + "\n" + 
        "Numero de lote: " + numeroDeLote;
    }
}
