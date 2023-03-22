package programacion.empresa;

public class productosRefrigerados extends empresaAlimentaria {
    int codigoOrganismo;
    int temperaturaRecomendada;
    String paisDeOrigen;

    public productosRefrigerados(int codigoOrganismo, int temperaturaRecomendada, String paisDeOrigen, String fechaDeCaducidad, int numeroDeLote){
        super(fechaDeCaducidad, numeroDeLote);
        this.codigoOrganismo = codigoOrganismo;
        this.temperaturaRecomendada = temperaturaRecomendada;
        this.paisDeOrigen = paisDeOrigen;
    }

    public String toString(){
        return "Fecha de caducidad: " + fechaDeCaducidad + "\n" + 
        "Numero de lote: " + numeroDeLote + "\n" + 
        "País de Origen: " + paisDeOrigen + "\n" + 
        "Temperatura recomendada: " + temperaturaRecomendada + "\n" + 
        "Codigo de organismo: " + codigoOrganismo;
    }
}
