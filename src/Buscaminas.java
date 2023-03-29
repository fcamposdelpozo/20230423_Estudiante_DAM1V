import java.util.Scanner;
import programacion.juegos.tablero;

public class Buscaminas {
    public static void main(String args[]) {

        int filas;
        int columnas;
        int minas;
        Scanner in = new Scanner(System.in);
        int decisionColumna;
        int decisionFila;

        //EXPLICO LAS CARACTERISTICAS DEL JUEGO
        System.out.println();
        System.out.println("*****JUEGO BUSCAMINAS*****\n"
        + "\n"
        + "-Representacion: Los numeros 0, 1 y 2 representan la cantidad de minas que hay alrededor de la casilla que has elegido.\n"
        + " Si sale un 0, significa que no hay ninguna mina, si sale un 1 significa que hay una, y, si sale un 2, significa que hay dos minas.\n"
        + "Si por el contrario, el numero que sale es un -1, indicara que has caido en una mina, y el juego habra finalizado.\n"
        + "\n"
        + "*****MUCHA SUERTE*****");
        System.out.println();


        do{

            System.out.println("Introduce el numero de filas que tiene el tablero");
            filas = in.nextInt();
            System.out.println("Introduce el numero de columnas que tiene el tablero");
            columnas = in.nextInt();
            System.out.println("Introduce el numero de minas que tiene el tablero");
            minas = in.nextInt();
            if(filas < 0 || filas > 6 || columnas < 0 || columnas > 6 || minas > filas || minas > columnas){
                System.out.println("Los parametros ingresados para el tablero no son correctos. Deben ser: \nLas filas mayor de cero y menores de quince.\n" + 
                "Las columnas deben ser mayores que cero y menores que quince.\n" + 
                "Las minas no pueden ser mayores que las filas ni que las columnas.");
            }
            
        }while(filas < 0 || filas > 15 || columnas < 0 || columnas > 15 || minas > filas || minas > columnas);

        tablero buscaminas = new tablero(filas, columnas, minas);
        buscaminas.generaMinas();
        buscaminas.tableroCompleto();

        buscaminas.muestroArray();

        do{
            System.out.println("**************************");

            do{
                System.out.println("Introduce una posicion de la fila que quieras comprobar:");
                decisionFila = in.nextInt();
                System.out.println("Introduce una posicion de la columna que quieras comprobar:");
                decisionColumna = in.nextInt();
                if(decisionFila < 1 || decisionFila > 6 || decisionColumna < 1 || decisionColumna > 6){
                    System.out.println("La posicion del tablero no puede ser menor que 1 ni mayor que 6. Vuelve a introducir los valores.");
                }

            }while(decisionFila < 1 || decisionFila > 6 || decisionColumna < 1 || decisionColumna > 6);

            buscaminas.guardoDecisionUsuario(decisionFila, decisionColumna);
            buscaminas.muestroArray();


        }while(buscaminas.caeMina(decisionFila, decisionColumna) == false);

    }
}
