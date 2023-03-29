import java.util.Scanner;

import programacion.EjerciciosDePractica.Alumno;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class AlumnoMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numAlumnos = 0;
        String nombre = "";
        String sexo = "";
        int edad;
        ArrayList<Alumno> arrayAlumnos = new ArrayList<Alumno>();

        Alumno alumno1 = new Alumno();

        do{
                System.out.println("Introduce el numero de alumnos que hay en la clase.");
                numAlumnos = in.nextInt();
                if(numAlumnos < 0 || numAlumnos > 50){
                    System.out.println("Debes ingresar un numero entre 0 y 50");
                    numAlumnos = in.nextInt();
                    in.nextLine();
                }
        }while(numAlumnos <= 0);

        try {
            do {

                in.nextLine();
                System.out.println("Introduce el nombre del alumno");
                nombre = in.nextLine();
                System.out.println("Introduce el sexo del alumno");
                sexo = in.nextLine();
                System.out.println("Introduce la edad del alumno");
                edad = in.nextInt();

                alumno1.setNombre(nombre);
                alumno1.setSexo(sexo);
                alumno1.setEdad(edad);

                for(int i = 0; i < arrayAlumnos.size(); i++){
                    if (comprueboAlumno(nombre, sexo, edad) == true) {
                        if(arrayAlumnos.get(i) == null){
                        arrayAlumnos.add(i, alumno1);
                        }
                    }
                }

            } while (arrayAlumnos.size() != numAlumnos);
        }

        catch (java.lang.NumberFormatException exception) {
            System.out.println("No has ingresado una edad correcta.");
        }

        catch (java.util.InputMismatchException exception) {
            System.out.println("Has ingresado un numero incorrecto en edad o en numero de alumnos de clase.");
        }

        for (int i = 0; i < arrayAlumnos.size(); i++) {
            System.out.println(arrayAlumnos.get(i));
        }

        /*
         * alumno1.setNombre(nombre);
         * alumno1.setSexo(sexo);
         * System.out.println(alumno1);
         */
    }

    public static boolean comprueboAlumno(String nombre, String sexo, int edad) {

        if (nombre.isEmpty()) {
            return false;
        }

        if (sexo.isEmpty()) {
            return false;
        }

        if (!sexo.equals("Femenino") && !sexo.equals("Masculino")) {
            return false;
        }

        if (edad < 1 || edad > 22) {
            return false;
        }

        return true;
    }

}
