import programacion.empresa.Domestica;
import programacion.empresa.Industrial;

public class MaquinariaEmpresa {
    public static void main(String[] args) {

        //Creamos objetos de la clase Industrial y Domestica
        Industrial maquinaIndustrial = new Industrial("AVG-320", 3233, 1400, 900);
        Domestica maquinaDomestica = new Domestica("RF-150", 4567, 1000);

        //Utilizamos los metodos del objeto Industrial
        System.out.println(maquinaIndustrial);
        maquinaIndustrial.encender();
        maquinaIndustrial.apagar();

        //Coloco saltos de linea entre ambas maquinas
        System.out.println("\n" + 
                            "\n");
        //Utilizamos los metodos del objeto Domestica
        System.out.println(maquinaDomestica);
        maquinaDomestica.encender();
        maquinaDomestica.apagar();
    }
}
