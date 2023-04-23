package programacion.empresa;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EmpresaAlimentaria {

    // Defino variables de la empresa
    String nombre;
    String cif;

    // Creo los arrayList que van a gestionar los productos
    // Renombro los atributos: array es un tipo concreto de dato de tamaño fijo, lo que estás creando son 
    // ArrayList, que permiten acceder a los elementos por sus posiciones pero su tamaño es dinámico, no como
    // los arrays. La propiedad de acceder por posición es característica de List, así que te los renombro array->lista
    ArrayList<ProductoCongelado> listaProductosCongelados = new ArrayList<ProductoCongelado>();
    ArrayList<ProductoFresco> listaProductosFrescos = new ArrayList<ProductoFresco>();
    ArrayList<ProductoRefrigerado> listaProductosRefrigerados = new ArrayList<ProductoRefrigerado>();

    // Creo los constructores
    public EmpresaAlimentaria(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
    }

    // Hago los metodos que añadiran los diferentes objetos de cada clase al array
    public void addProductoFresco(ProductoFresco productoFresco) {
        listaProductosFrescos.add(productoFresco);
    }

    public void addProductoCongelado(ProductoCongelado productoCongelado) {
        listaProductosCongelados.add(productoCongelado);
    }

    public void addProductoRefrigerado(ProductoRefrigerado productoRefrigerado) {
        listaProductosRefrigerados.add(productoRefrigerado);
    }

    // Hago el metodo toString de la empresa
    public String toString() {
        String cadena;
        cadena = "*****EMPRESA ALIMENTARIA: " + nombre + "*****" + " CIF: " + cif;
        if (listaProductosFrescos.isEmpty() == false) {
            cadena += "\n" + ">> Productos Frescos: ";
            for (int i = 0; i < listaProductosFrescos.size(); i++) {
                cadena += i + ".\n" + listaProductosFrescos.get(i) + "\n";
            }
        }

        if (listaProductosCongelados.isEmpty() == false) {
            cadena += "\n" + ">> Productos Congelados: ";
            for (int i = 0; i < listaProductosCongelados.size(); i++) {
                cadena += i + "\n" + listaProductosCongelados.get(i) + "\n";
            }
        }

        return cadena;
    }

    public boolean escribirFicherosDeProductos() {
      boolean success = true;
      if(escribirFicheroFresco() == false) {
        success = false;
      }
      if(escribirFicheroRefrigerado() == false) {
        success = false;
      }
      if(escribirFicheroCongelado() == false) {
        success = false;
      }
      return success;
    }

    // Controlo la creacion y modificacion del fichero
    // escribirFicheroFresco() no deben lanzar ninguna excepción IOException: si este es el método 
    // encargado de escribir y hacer operaciones de IO, también debe gestionar sus excepciones. De 
    // hecho has capturado todas menos la que se puede producir al llamar a close().
    public boolean escribirFicheroFresco() { // throws IOException {
        FileWriter escritorCSV = null;

        // Se me ocurre que podríamos añadir la siguiente comprobación para que si la lista está vacía,
        // no perdamos el tiempo abriendo un fichero y escribiendo una cabecera cuando no va a haber
        // ningún producto que añadir. Devolvemos true porque no ha habido ningún error y listo:
        if(listaProductosFrescos.isEmpty() == true) {
          return true;
        }

        try {
            // La ruta al fichero como cadena literal es equivalente a usar números mágicos: es mejor que 
            // lo metas en un atributo static final en la clase correspondiente, por ejemplo añadiendo este
            // atributo en la clase ProductoFresco:
            // public static final String CSV_NOMBRE_FICHERO = "ProductosFrescos.csv";
            // Piensa que la ruta absoluta quizá funcione en tu portátil, pero no va a funcionar en el mío o en 
            // cualquier ordenador de un aula que no tenga el directorio C:\Users\Alvaro\OneDrive\Escritorio.
            // En este nivel yo te recomiendo que uses el nombre del fichero directamente, sin ruta.

            //escritorCSV = new FileWriter("C:\\Users\\Alvaro\\OneDrive\\Escritorio\\ProductosFrescos.csv", true);
            escritorCSV = new FileWriter(ProductoFresco.CSV_NOMBRE_FICHERO);
            
            // Si le has pasado append a true, podrías escribir la cabecera CSV más de 1 vez por fichero.
            escritorCSV.write(ProductoFresco.csvHeader() + "\n");
            
            // En general no hace falta llamar a flush() cada vez que llamas a write(). Sirve para ir viendo los 
            // cambios en el fichero según se escribe cada línea, pero normalmente no se usa. Cuando llames a close()
            // se escriben a disco todos los cambios que haya pendientes
            //escritorCSV.flush();
            
            for (int i = 0; i < listaProductosFrescos.size(); i++) {
                // ¿Por qué usas append en vez de write? ¿Cuál es la diferencia? Yo lo desconozco, pero puede 
                // inducir a error. Normalmente, con ficheros, se usa read()/readLine() para leer y write() para escribir.
                //  Mira en el javadoc con el api de Java la diferencia entre write() y append() 
                // y lo comentamos en clase.
                escritorCSV.append(listaProductosFrescos.get(i).toCsvLine() + "\n");
            }
        } catch (IOException exc) {
            // Si salta una excepción y la capturamos aquí, imprimes "Error al leer el fichero.", pero el error ha podido
            // ser al abrir el fichero o al escribir alguna de las líneas. Y esos detalles te los puede dar la excepción:
            System.out.println("Excepción en escribirFicheroFresco(): " + exc);
            //System.out.println("Error al leer el fichero.");
            
            // Creo que es importante que en caso de error/excepción, además de imprimir un mensaje, 
            // es interesante notificar del error a quien ha llamado al método escribirFicheroXXX() 
            // devolviendo false
            return false;
        } finally {
          try{
            escritorCSV.close();
          } catch (IOException exc){
            System.out.println("Excepción en escribirFicheroFresco() al cerrar el fichero: " + exc);
            return false;
          }
        }
        return true;
    }

    public boolean escribirFicheroCongelado() { //throws IOException {
        FileWriter escritor = null;
        try {
            //escritor = new FileWriter("C:\\Users\\Alvaro\\OneDrive\\Escritorio\\ProductosCongelados.csv", true);
            escritor = new FileWriter(ProductoCongelado.CSV_NOMBRE_FICHERO);
            escritor.write(ProductoCongelado.csvHeader() + "\n");
            escritor.flush();
            for (int i = 0; i < listaProductosCongelados.size(); i++) {
                escritor.append(listaProductosCongelados.get(i).toCsvLine() + "\n");
            }
        } catch (IOException exc) {
            System.out.println("Error al crear el fichero.");
            return false;
        } finally {
          try{
            escritor.close();
          } catch (IOException exc){
            System.out.println("Excepción en escribirFicheroFresco() al cerrar el fichero: " + exc);
            return false;
          }
        }
        return true;
    }

    public boolean escribirFicheroRefrigerado() { // throws IOException {
        FileWriter escritor = null;
        try{
            // escritor = new FileWriter("C:\\Users\\Alvaro\\OneDrive\\Escritorio\\productosRefrigerados.csv", true);
            escritor = new FileWriter(ProductoRefrigerado.CSV_NOMBRE_FICHERO);
            escritor.write(ProductoRefrigerado.csvHeader() + "\n");
            escritor.flush();
            for(int i = 0; i < listaProductosRefrigerados.size(); i++){
                escritor.append(listaProductosRefrigerados.get(i).toCsvLine() + "\n");
            }
        }catch(IOException exc){
            System.out.println("Error al leer el archivo.");
            return false;
        }finally{
          try{
            escritor.close();
          } catch (IOException exc){
            System.out.println("Excepción en escribirFicheroFresco() al cerrar el fichero: " + exc);
            return false;
          }
        }
        return true;
    }
}
