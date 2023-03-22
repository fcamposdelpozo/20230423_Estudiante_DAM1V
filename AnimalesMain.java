
import java.util.*;

import programacion.EjerciciosDePractica.Gato;
import programacion.EjerciciosDePractica.Perro;

public class AnimalesMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;

        String nombre;
        int edad;
        String especie;
        String raza;
        String pelaje;

        
        do{
            addMenu();
            opcion = in.nextInt();
            in.nextLine();
        
            switch (opcion) {
                case 1:

                    break;

                case 2:
                    System.out.println("Ingresar datos animales:");
                    System.out.println("Introduce que animales quieres ingresar:\n"
                            + "1. Perro.\n"
                            + "2. Gato.");
                    int opcionAnimal;
                    opcionAnimal = in.nextInt();
                    in.nextLine();
                    switch (opcionAnimal) {
                        case 1:
                            System.out.println("Has elegido ingresar un perro.\n"
                                    + "Introduce el nombre del perro:");
                            nombre = in.nextLine();
                            System.out.println("Introduce la edad del perro:");
                            edad = in.nextInt();
                            in.nextLine();
                            System.out.println("Introduce la especie del perro:");
                            especie = in.nextLine();
                            System.out.println("Introduce la raza del perro:");
                            raza = in.nextLine();
                            System.out.println("-----------------------------------\n");

                            Perro perro1 = new Perro(nombre, edad, especie, raza);
                            perro1.addPerro(nombre, edad, especie, raza);
                            System.out.println(perro1);
                            System.out.println("");
                            perro1.comer();
                            perro1.ladrar();
                            break;
                        
                        case 2:
                            System.out.println("Has elegido ingresar un gato.\n"
                            + "Introduce el nombre del gato:");
                            nombre = in.nextLine();
                            System.out.println("Introduce la edad del gato:");
                            edad = in.nextInt();
                            in.nextLine();
                            System.out.println("Introduce la especie del gato:");
                            especie = in.nextLine();
                            System.out.println("Introduce el tipo de pelaje del gato:");
                            pelaje = in.nextLine();
                            System.out.println("-----------------------------------\n");

                            Gato gato1 = new Gato(nombre, edad, especie, pelaje);
                            System.out.println(gato1);
                            System.out.println("");
                            gato1.comer();
                            gato1.maullar();

                            break;
                    }
                }   
        }while(opcion != 3);
        
    }

    public static void addMenu() {
        System.out.println("*****MENU ANIMALES*****\n"
                + "Elige una opcion:\n"
                + "1. Ingresar animal\n"
                + "2. Ingresar dato de animales\n"
                + "3. SALIR..........");
    }
}
