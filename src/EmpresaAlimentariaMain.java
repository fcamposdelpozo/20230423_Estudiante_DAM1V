import java.util.HashMap;

import programacion.empresa.EmpresaAlimentaria;
import programacion.empresa.ProductoCongelado;
import programacion.empresa.ProductoFresco;
import programacion.empresa.ProductoRefrigerado;

// Noto una indentación de 4 caracteres en vez de 2 como indica la guía de estilo para Java de Google:
// https://google.github.io/styleguide/javaguide.html#s4.2-block-indentation
// No es un error, pero debes saber cómo configurarlo y adaptarte a las reglas que haya en el equipo/empresa 
// en el que trabajes. En el módulo de Programación vamos a seguir la guía de Google.
// Una vez configurada la indentación a 2 espacios, puedes usar la opción de "Formatear documento" para que
// se encargue VSCode. Si no sabes cómo hacerlo, lo vemos en clase.

public class EmpresaAlimentariaMain {
    // No es buena práctica que el método main lance excepciones. Deberíamos ser capaces de 
    // capturar y gestionar nosotros las excepciones que se puedan producir.
    public static void main(String[] args) { //throws IOException {

        //Creo productos congelados
        EmpresaAlimentaria MiEmpresa = new EmpresaAlimentaria("AgroCultura", "625465F");
        // Hay que intentar seguir una lógica incluso en los ejemplos: "Gambas Congeladas" debería ser un 
        // producto congelado y "Gambas" uno refrigerado.

        // Te recomiendo que te acostumbres a escribir las fechas en formato año-mes-dia. La fecha de 
        // caducidad de las Gambas Congeladas sería "2022-03-21". Este formato es el definido por el ISO-8601:
        // https://es.wikipedia.org/wiki/ISO_8601
        // La gran ventaja es que podrías ordenar las fechas aunque estén en formato cadena. Además siempre es
        // bueno usar el estándar cuando exista. Y encima es el formato que utiliza LocalDate:
        // https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
        ProductoCongelado productoCongelado = new ProductoCongelado("Gambas Congeladas", "21/03/2022", 54356, "16/02/2022", "España", 3);
        MiEmpresa.addProductoCongelado(productoCongelado);
        //MiEmpresa.escribirFicheroCongelado();

        //Creo productos frescos
        ProductoFresco Lechuga = new ProductoFresco("Lechuga", "12/04/2023", 34536, "11/03/2023", "FR");
        ProductoFresco Tomate = new ProductoFresco("Tomate", "16/01/2022", 83478, "01/01/2022", "TURQ");
        MiEmpresa.addProductoFresco(Tomate);
        MiEmpresa.addProductoFresco(Lechuga);
        // MiEmpresa.escribirFicheroFresco();

        //Creo productos refrigerados
        ProductoRefrigerado vainilla = new ProductoRefrigerado("Vainilla", "23/02/2021", 23421, "12/01/2020", "LI", "7644T", 1);
        ProductoRefrigerado GambasCongeladas = new ProductoRefrigerado("Gambas", "27/12/2023", 345345, "23/10/2023", "ALE", "23432", -3);
        MiEmpresa.addProductoRefrigerado(GambasCongeladas);
        MiEmpresa.addProductoRefrigerado(vainilla);
        // MiEmpresa.escribirFicheroRefrigerado();

        // Veo más fácil que el usuario de la clase EmpresaAlimentaria, quien escribe el main, sepa que puede
        // guardar los productos a ficheros. Tener que llamar a cada uno de los métodos para guardar cada tipo 
        // de producto es un poco engorroso. Si mañana añadimos un nuevo tipo de producto, con añadirlo al método
        // escribirFicherosDeProductos() sería suficiente, no necesitaríamos cambiar el main.
        // Yo lo haría así (además he comentado las llamadas a los métodos escribirFicheroXXXX() de más arriba):
        MiEmpresa.escribirFicherosDeProductos();
       
        //Prueba de Coleccion HasMap
        HashMap <Object,String> prueba = new HashMap<>();
        prueba.put(GambasCongeladas, "Las gambas vienen de Alemania");
        System.out.println(prueba.get(GambasCongeladas));
        
    }
}
