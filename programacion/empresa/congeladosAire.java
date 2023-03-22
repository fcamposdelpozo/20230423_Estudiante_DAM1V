package programacion.empresa;
import java.util.Vector;

public class congeladosAire extends productosCongelados {
    Vector<congeladosAire> composicionAire;

    public congeladosAire(String fechaEnvasado, String paisDeOrigen, int temperaturaRecomendada, String fechaDeCaducidad, int numeroDeLote){
        super(fechaEnvasado, paisDeOrigen, temperaturaRecomendada, fechaDeCaducidad, numeroDeLote);
        composicionAire = new Vector<congeladosAire>();
    }

}
