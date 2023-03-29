import java.util.Scanner;
import java.util.Vector;
import programacion.EjerciciosDePractica.Trabajador;

public class PersonaMain {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String nombre;
        String telefono;
        int edad;
        int categoriaProfesional;
        int antigüedad;
        int contador = 0;
        Vector <Trabajador> vectorTrabajador;
        vectorTrabajador = new Vector<Trabajador>();

        do{
            System.out.println("Introduce el nombre de la persona:");
            nombre = in.nextLine();
            System.out.println("Introduza un telefono de la persona");
            telefono = in.nextLine();
            System.out.println("Introduce la edad de la persona");
            edad = in.nextInt();
            in.nextLine();
            System.out.println("Elige una categoria profesional:\n1. A\n2. B\n3. C");
            categoriaProfesional = in.nextInt();
            in.nextLine();
            System.out.println("Introduce la antigüedad del trabajador:");
            antigüedad = in.nextInt();
            in.nextLine();
            Trabajador trabajador1 = new Trabajador(nombre, telefono, edad, categoriaProfesional, antigüedad);

            if(trabajador1.comprobarPersona() == true){
                System.out.println("Datos ingresados correctamente.");
                vectorTrabajador.add(trabajador1);
            }else{
                System.out.println("Los datos no han podido ser ingresados.");
            }

            System.out.println(trabajador1.toString());

            contador++;

        }while(contador < 2);

    }   
}
