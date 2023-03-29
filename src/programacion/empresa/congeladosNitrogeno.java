package programacion.empresa;

public class congeladosNitrogeno extends productosCongelados {
    String metodoCongelacion;
    int tiempoExposicionNitrogeno;

    public congeladosNitrogeno(String metodoCongelacion, int tiempoExposicionNitrogeno, String fechaEnvasado, String paisDeOrigen, int temperaturaRecomendada, String fechaDeCaducidad, int numeroDeLote){
        super(fechaEnvasado, paisDeOrigen, temperaturaRecomendada, fechaDeCaducidad, numeroDeLote);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
    }
}
