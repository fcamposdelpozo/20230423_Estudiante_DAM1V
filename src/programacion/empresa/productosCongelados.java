package programacion.empresa;

public class productosCongelados extends producto {
    String paisDeOrigen;
    int temperaturaRecomendada;

    public productosCongelados(String paisDeOrigen, int temperaturaRecomendada, String fechaDeCaducidad, int numeroDeLote){
        super(paisDeOrigen, fechaDeCaducidad, numeroDeLote);
        this.paisDeOrigen = paisDeOrigen;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public String toString(){
        return super.toString() + "Pais de Origen: " + paisDeOrigen + "\n" + 
        "Temperatura recomendada: " + temperaturaRecomendada;
    }
}

