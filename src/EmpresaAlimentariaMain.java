import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import programacion.empresa.EmpresaAlimentaria;
import programacion.empresa.ProductoCongelado;
import programacion.empresa.ProductoFresco;
import programacion.empresa.ProductoRefrigerado;

public class EmpresaAlimentariaMain {
    public static void main(String[] args) throws IOException {

        //Creo productos congelados
        EmpresaAlimentaria MiEmpresa = new EmpresaAlimentaria("AgroCultura", "625465F");
        ProductoCongelado productoCongelado = new ProductoCongelado("Gambas", "21/03/2022", 54356, "16/02/2022", "España", 3);
        MiEmpresa.addProductoCongelado(productoCongelado);
        MiEmpresa.escribirFicheroCongelado();

        //Creo productos frescos
        ProductoFresco Lechuga = new ProductoFresco("Lechuga", "12/04/2023", 34536, "11/03/2023", "FR");
        ProductoFresco Tomate = new ProductoFresco("Tomate", "16/01/2022", 83478, "01/01/2022", "TURQ");
        MiEmpresa.addProductoFresco(Tomate);
        MiEmpresa.addProductoFresco(Lechuga);
        MiEmpresa.escribirFicheroFresco();

        //Creo productos refrigerados
        ProductoRefrigerado vainilla = new ProductoRefrigerado("Vainilla", "23/02/2021", 23421, "12/01/2020", "LI", "7644T", 1);
        ProductoRefrigerado GambasCongeladas = new ProductoRefrigerado("Gambas Congeladas", "27/12/2023", 345345, "23/10/2023", "ALE", "23432", -3);
        MiEmpresa.addProductoRefrigerado(GambasCongeladas);
        MiEmpresa.addProductoRefrigerado(vainilla);
        MiEmpresa.escribirFicheroRefrigerado();
       
        //Prueba de Coleccion HasMap
        HashMap <Object,String> prueba = new HashMap<>();
        prueba.put(GambasCongeladas, "Las gambas vienen de Alemania");
        System.out.println(prueba.get(GambasCongeladas));
        
    }
}
