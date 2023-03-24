import programacion.EjerciciosDePractica.Administrador;
import programacion.EjerciciosDePractica.Vecino;

import java.util.Scanner;
public class ComunidadVecinosMain {
    public static void main(String[] args) {
        float cuota;
        Scanner in = new Scanner (System.in);

        Administrador administrador1 = new Administrador("34242", "Arganzuela", 123, "Alfonso Perez", "11850490Q", 54);
        System.out.println("Introduce la cuota que paga cada vecino:");
        cuota = in.nextFloat();
        administrador1.setSalarioMaximo(cuota);
        System.out.println(administrador1);

        Vecino vecino1 = new Vecino("V4534", "46456", "ARGANZUELA", "JOAQUIN", "44747345634R", 30);
        if(vecino1.codigoValido() == false){
            System.out.println("El codigo introducido no es correcto");
        }else{
            System.out.println(vecino1);
        }
 
    }
}
