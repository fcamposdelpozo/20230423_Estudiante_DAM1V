import programacion.empresa.productosFrescos;
import programacion.empresa.productosRefrigerados;

public class EmpresaAlimentariaMain {
    public static void main(String[] args) {

        productosFrescos lechuga = new productosFrescos("18/08/2019", "China", "22/09/2019", 322424);
        System.out.println("LECHUGAS\n" + lechuga);
        productosFrescos tomate = new productosFrescos("13/01/2020", "España", "28/01/2020", 456347);
        System.out.println("-------------------------------");
        System.out.println("TOMATE\n" + tomate);
        productosRefrigerados gambas = new productosRefrigerados(53535, 23, "Belgica", "21/04/2021", 324422);
        System.out.println("-------------------------------");
        System.out.println("GAMBAS\n" + gambas);
    }
}
