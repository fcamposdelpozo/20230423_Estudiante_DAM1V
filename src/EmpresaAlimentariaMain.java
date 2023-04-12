import programacion.empresa.productosFrescos;
import programacion.empresa.productosRefrigerados;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpresaAlimentariaMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String respuesta;
        int opcion;
        String nombre;
        String fechaDeCaducidad;
        int numeroDeLote;
        String fechaEnvasado;
        String paisDeOrigen;
        int codigoOrganismo;
        int temperaturaRecomendada;
        ArrayList<productosFrescos> arrayProductoFresco = new ArrayList<productosFrescos>();
        ArrayList<productosRefrigerados> arrayProductoRefrigerado = new ArrayList<productosRefrigerados>();

        productosFrescos producto1 = new productosFrescos();
        productosRefrigerados productoRefrigerado1 = new productosRefrigerados();

        //REALIZO EL MENU PARA PEDIR QUE PRODUCTO QUIERE INCLUIR
        do {
            Menu();
            opcion = in.nextInt();
            in.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado introducir un producto fresco.");

                    //PIDO INTRODUCIR LOS DATOS DEL PRODUCTO
                    do{
                        System.out.println("Introduce el nombre del producto:");
                        nombre = in.nextLine();
                        System.out.println("Introduce su fecha de caducidad:");
                        fechaDeCaducidad = in.nextLine();
                        System.out.println("Introduce su numero de lote: ");
                        numeroDeLote = in.nextInt();
                        in.nextLine();
                        producto1.setDatos(nombre, fechaDeCaducidad, numeroDeLote);

                        //COMPRUEBO QUE LOS DATOS SON CORRECTOS
                        if (producto1.datosCorrectos() == false) {
                            System.out.println("Los datos que has introducido no son correctos. Vuelve a introducirlos.");
                        }
                    }while(producto1.datosCorrectos() == false);

                    System.out.println("Introduce la fecha de envasado del producto:");
                    fechaEnvasado = in.nextLine();
                    System.out.println("Introduce el pais de origen del producto:");
                    paisDeOrigen = in.nextLine();

                    producto1.setDatosProducto(fechaEnvasado, paisDeOrigen);
                    System.out.println("           ");
                    System.out.println(producto1);
                    System.out.println("-----------------");
                    break;

                case 2:
                
                do{
                    System.out.println("Has seleccionado introducir un producto refrigerado.");
                    System.out.println("Introduce el nombre del producto:");
                    nombre = in.nextLine();
                    System.out.println("Introduce su fecha de caducidad:");
                    fechaDeCaducidad = in.nextLine();
                    System.out.println("Introduce su numero de lote: ");
                    numeroDeLote = in.nextInt();
                    in.nextLine();
                    System.out.println("Introduce el codigo del organismo que envia el producto.");
                    codigoOrganismo = in.nextInt();
                    in.nextLine();
                    System.out.println("Introduce la temperatura recomendada del producto:");
                    temperaturaRecomendada = in.nextInt();
                    in.nextLine();
                    System.out.println("Introduce el pais de origen del producto:");
                    paisDeOrigen = in.nextLine();

                    productoRefrigerado1.setDatos(nombre, fechaDeCaducidad, numeroDeLote);
                    productoRefrigerado1.datosRefrigerados(codigoOrganismo, temperaturaRecomendada, paisDeOrigen);

                    if(productoRefrigerado1.datosCorrectos() == false){
                        System.out.println("Datos introducidos incorrectos.");
                    }
                }while(productoRefrigerado1.datosCorrectos() == false);

                    System.out.println();
                    System.out.println(productoRefrigerado1);
                    System.out.println("*******************");

                    for (int i = 0; i < arrayProductoRefrigerado.size(); i++) {
                        if (arrayProductoRefrigerado.get(i) == null) {
                            arrayProductoRefrigerado.add(productoRefrigerado1);
                        }
                    }

                    System.out.println("¿Desea ver los productos refrigerados guardados? S/N");
                    respuesta = in.nextLine();
                    if (respuesta.equalsIgnoreCase("S")) {
                        for (int i = 0; i < arrayProductoRefrigerado.size(); i++) {
                            System.out.println(arrayProductoRefrigerado.get(i));
                        }
                    } else if (respuesta.equalsIgnoreCase("N")) {
                        System.out.println("Has decidido no ver los productos almacenados.");
                    } else {
                        System.out.println("Respuesta introducida no reconocida.");
                    }
                    break;

                case 3:
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta. Vuelve a intentarlo.");
                    System.out.println();
                    break;
            }
        } while (opcion != 4);
    }

    public static void Menu() {
        System.out.println("***MENU EMPRESA CONGELADOS***\n" +
                "Elige una opcion:\n" +
                "1. Ingresar producto fresco.\n" +
                "2. Ingresar producto refrigerado.\n" +
                "3. Ingresar producto congelado.\n" +
                "4. SALIR.......");
    }
}
