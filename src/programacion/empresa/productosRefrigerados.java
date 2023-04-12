package programacion.empresa;

public class productosRefrigerados extends producto {
    int codigoOrganismo;
    int temperaturaRecomendada;
    String paisDeOrigen;

    public productosRefrigerados(String nombre, int codigoOrganismo, int temperaturaRecomendada, String paisDeOrigen, String fechaDeCaducidad, int numeroDeLote){
        super(nombre, fechaDeCaducidad, numeroDeLote);
        this.codigoOrganismo = codigoOrganismo;
        this.temperaturaRecomendada = temperaturaRecomendada;
        this.paisDeOrigen = paisDeOrigen;
    }

    public productosRefrigerados(){
        
    }

    public String toString(){
        return "Nombre: " + nombre + "\n" + 
        "Fecha de caducidad: " + fechaDeCaducidad + "\n" + 
        "Numero de lote: " + numeroDeLote + "\n" + 
        "País de Origen: " + paisDeOrigen + "\n" + 
        "Temperatura recomendada: " + temperaturaRecomendada + "ºC\n" + 
        "Codigo de organismo: " + codigoOrganismo;
    }

    public void datosRefrigerados (int codigoOrganismo, int temperaturaRecomendada, String paisDeOrigen){
        this.codigoOrganismo = codigoOrganismo;
        this.temperaturaRecomendada = temperaturaRecomendada;
        this.paisDeOrigen = paisDeOrigen;
    }

    public boolean datosCorrectos(){

        if(super.nombre.isEmpty()){
            return false;
        }

        if(super.fechaDeCaducidad.isEmpty()){
            return false;
        }

        if(super.numeroDeLote < 50000 || super.numeroDeLote > 99999){
            return false;
        }

        if (codigoOrganismo < 1000 || codigoOrganismo > 7000){
            return false;
        }

        if (temperaturaRecomendada > 10){
            System.out.println("Los productos refrigerados no pueden almacenarse a mas de 10ºC.");
            return false;
        }

        if (paisDeOrigen.isEmpty()){
            return false;
        }

        return true;
    }
}
