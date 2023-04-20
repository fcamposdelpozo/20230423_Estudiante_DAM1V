package programacion.empresa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EmpresaAlimentaria {

    // Defino variables de la empresa
    String nombre;
    String cif;

    // Creo los arrayList que van a gestionar los productos
    ArrayList<ProductoCongelado> arrayProductosCongelados = new ArrayList<ProductoCongelado>();
    ArrayList<ProductoFresco> arrayProductosFrescos = new ArrayList<ProductoFresco>();
    ArrayList<ProductoRefrigerado> arrayProductosRefrigerados = new ArrayList<ProductoRefrigerado>();

    // Creo los constructores
    public EmpresaAlimentaria(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
    }

    // Hago los metodos que añadiran los diferentes objetos de cada clase al array
    public void addProductoFresco(ProductoFresco productoFresco) {
        arrayProductosFrescos.add(productoFresco);
    }

    public void addProductoCongelado(ProductoCongelado productoCongelado) {
        arrayProductosCongelados.add(productoCongelado);
    }

    public void addProductoRefrigerado(ProductoRefrigerado productoRefrigerado) {
        arrayProductosRefrigerados.add(productoRefrigerado);
    }

    // Hago el metodo toString de la empresa
    public String toString() {
        String cadena;
        cadena = "*****EMPRESA ALIMENTARIA: " + nombre + "*****" + " CIF: " + cif;
        if (arrayProductosFrescos.isEmpty() == false) {
            cadena += "\n" + ">> Productos Frescos: ";
            for (int i = 0; i < arrayProductosFrescos.size(); i++) {
                cadena += i + ".\n" + arrayProductosFrescos.get(i) + "\n";
            }
        }

        if (arrayProductosCongelados.isEmpty() == false) {
            cadena += "\n" + ">> Productos Congelados: ";
            for (int i = 0; i < arrayProductosCongelados.size(); i++) {
                cadena += i + "\n" + arrayProductosCongelados.get(i) + "\n";
            }
        }

        return cadena;
    }

    // Controlo la creacion y modificacion del fichero
    public void escribirFicheroFresco() throws IOException {
        FileWriter escritorCSV = null;
        try {
            escritorCSV = new FileWriter("C:\\Users\\Alvaro\\OneDrive\\Escritorio\\ProductosFrescos.csv", true);
            escritorCSV.write(ProductoFresco.csvHeader() + "\n");
            escritorCSV.flush();
            for (int i = 0; i < arrayProductosFrescos.size(); i++) {
                escritorCSV.append(arrayProductosFrescos.get(i).toCsvLine() + "\n");
            }
        } catch (IOException exc) {
            System.out.println("Error al leer el fichero.");
        } finally {
            escritorCSV.close();
        }
    }

    public void escribirFicheroCongelado() throws IOException {
        FileWriter escritor = null;
        try {
            escritor = new FileWriter("C:\\Users\\Alvaro\\OneDrive\\Escritorio\\ProductosCongelados.csv", true);
            escritor.write(ProductoCongelado.csvHeader() + "\n");
            escritor.flush();
            for (int i = 0; i < arrayProductosCongelados.size(); i++) {
                escritor.append(arrayProductosCongelados.get(i).toCsvLine() + "\n");
            }
        } catch (IOException exc) {
            System.out.println("Error al crear el fichero.");
        } finally {
            escritor.close();
        }
    }
}
