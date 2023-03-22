package programacion.empresa;

public class productosCongelados extends empresaAlimentaria {
    String fechaEnvasado;
    String paisDeOrigen;
    int temperaturaRecomendada;

    public productosCongelados(String fechaEnvasado, String paisDeOrigen, int temperaturaRecomendada, String fechaDeCaducidad, int numeroDeLote){
        super(fechaDeCaducidad, numeroDeLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisDeOrigen = paisDeOrigen;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public String toString(){
        return "Fecha Envasado: " + fechaEnvasado + "\n" + 
        "Pais de Origen: " + paisDeOrigen + "\n" + 
        "Temperatura recomendada: " + temperaturaRecomendada;
    }
}

