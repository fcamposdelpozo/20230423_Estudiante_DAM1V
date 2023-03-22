import programacion.recursividad.SumarNumeros_recursividad;
import programacion.recursividad.sumaNumerosPares_Recursividad;

public class MetodosRecursivosMain {
    public static void main(String[] args) {
        
        //EJERCICIO 1
        /* SumarNumeros_recursividad Ejercicio1 = new SumarNumeros_recursividad();
        Ejercicio1.SumaRecursiva(3);
        System.out.println(Ejercicio1.getSuma());
 */
        //EJERCICIO 2
        sumaNumerosPares_Recursividad Ejercicio2 = new sumaNumerosPares_Recursividad();
        Ejercicio2.sumaValoresPares(2,10);
        System.out.println(Ejercicio2.getSuma());
    }
}
