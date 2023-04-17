
import java.util.Scanner;
import java.util.Vector;

import programacion.empresa.Empleado;

public class EmpleadoMain {
    public static void main(String[] args) {

        // Declaro las variables
        final int MAX_EMPLEADOS = 5;
        Scanner in = new Scanner(System.in);
        int opcion = 0;

        Vector<Empleado> vectorEmpleado;
        vectorEmpleado = new Vector<Empleado>();

        Empleado empleado1 = new Empleado("Fernando", "Programacion", 24, 7000);
        Empleado empleado2 = new Empleado("Alvaro", "Lengua", 21, 5200);

        vectorEmpleado.add(empleado2);
        vectorEmpleado.add(empleado1);

        for(int i = 0; i < vectorEmpleado.size(); i++){
            System.out.println(vectorEmpleado.get(i));
        }
    }

        /* do {
            addMenu();
            opcion = in.nextInt();

            switch (opcion) {
                case 1:

                case 2:
                    String departamento;
                    String nombre;
                    int edad;
                    double salario;

                    System.out.println("Has seleccionado agregar un empleado.");
                    in.nextLine();

                    System.out.println("Introduce el nombre del empleado:");
                    nombre = in.nextLine();
                    System.out.println("Introduce el departamento del empleado:");
                    departamento = in.nextLine();
                    System.out.println("Introduce la edad del empleado:");
                    edad = in.nextInt();
                    System.out.println("Introduce el salario del empleado:");
                    salario = in.nextInt();
                    in.nextLine();

                    Empleado empleado = new Empleado(nombre, departamento, edad, salario);

                    break;

                case 3:
                    System.out.println("¡Goodbye!");
            }

        } while (opcion != 3);

    }

    public static void addMenu() {
        System.out.println("*****MENU EMPLEADOS*****\n" +
                "Elige una de las siguientes opciones:\n" +
                "1. Informacion empresa\n" +
                "2. Añadir empleado.\n" +
                "3. Salir.........");
    } */

}
