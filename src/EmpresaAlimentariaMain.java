import java.io.IOException;

import programacion.empresa.EmpresaAlimentaria;
import programacion.empresa.ProductoCongelado;
import programacion.empresa.ProductoFresco;

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
    }
}
