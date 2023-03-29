package programacion.empresa;

public class congeladosAgua extends productosCongelados {
    int salinidadAgua;

    public congeladosAgua(int salinidadAgua, String fechaEnvasado, String paisDeOrigen, int temperaturaRecomendada, String fechaDeCaducidad, int numeroDeLote){
        super(fechaEnvasado, paisDeOrigen, temperaturaRecomendada, fechaDeCaducidad, numeroDeLote);
        this.salinidadAgua = salinidadAgua;
    }
}
