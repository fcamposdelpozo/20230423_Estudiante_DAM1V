import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import programacion.empresa.SocioPolizas;

public class PolizasSanitariasMain {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner in = new Scanner(System.in);
        String nombre;
        String dni;
        int edad;
        ArrayList<SocioPolizas> listaSocios = new ArrayList<SocioPolizas>();

        do {
            try {
                menu();
                opcion = in.nextInt();

                in.nextLine();
            }

            catch (InputMismatchException exc) {
                System.out.println("Debes ingresar un numero. Vuelve a intentarlo.");
                System.out.println("");
                in.nextLine();
            }

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado ver datos de la clinica:");
                    for (int i = 0; i < listaSocios.size(); i++) {
                        System.out.println((i + 1) + "-. " + listaSocios.get(i));
                        System.out.println("--------------");
                    }

                    break;
                case 2:
                    System.out.println("Has seleccionado agregar un nuevo cliente:");
                    System.out.println("Introduce el nombre del socio:");
                    nombre = in.nextLine();
                    System.out.println("Introduce el dni del socio:");
                    dni = in.nextLine();
                    System.out.println("Introduce la edad del socio:");
                    edad = in.nextInt();
                    in.nextLine();

                    SocioPolizas newSocio = new SocioPolizas(nombre, dni, edad);

                    if (newSocio.esEdadValida() && newSocio.datosCorrectos() == true) {
                        int emptyIndex = -1;
                        for (int i = 0; i < listaSocios.size(); i++) {
                            if (listaSocios.get(i) == null) {
                                emptyIndex = i;
                                break;
                            }
                        }
                        if (emptyIndex != -1) {
                            listaSocios.set(emptyIndex, newSocio);
                            System.out.println("El socio ha sido agregado a la lista.");
                        } else {
                            listaSocios.add(newSocio);
                            System.out.println("El socio ha sido agregado al final de la lista.");
                        }
                    }else{
                        System.out.println("Los datos ingresados del socio no son correctos.");
                    }

                    break;
                    

                case 3:
                    System.out.println("¡Hasta pronto!");

                    break;
                default:
                    System.out.println("El numero ingresado no es correcto, vuelve a intentarlo.");
                    System.out.println();
            }
        } while (opcion != 3);

    }

    public static void menu() {
        System.out.println("****POLIZAS SANITARIAS****\n" +
                "Elige una opcion:\n" +
                "1. Ver datos clinica.\n" +
                "2. Ingresar cliente.\n" +
                "3. SALIR.......");
    }
}
