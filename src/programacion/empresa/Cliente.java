package programacion.empresa;
public class Cliente {
    private String nombre;
    private String apellido;
    private String numeroTelefono;

    public Cliente(String nombre, String apellido, String numeroTelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTelefono = numeroTelefono;
    }

    public Cliente() {

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getnumeroTelefono() {
        return numeroTelefono;
    }

    public boolean validoCliente(String nombre, String apellido, String numeroTelefono) {
        if (nombre.isEmpty()) {
            return false;
        }
        if (apellido.isEmpty()) {
            return false;
        }
        if (numeroTelefono.isEmpty()) {
            return false;
        }

        return true;
    }

    public boolean addCliente() {
        if (validoCliente(nombre, apellido, numeroTelefono) == false) {
            System.out.println("No ha sido posible añadir un nuevo cliente. Vuelve a intentarlo.");
            return false;
        } else {
            System.out.println("Cliente añadido correctamente");
            return true;
        }
    }

    public String toString() {
        String cadena;
        cadena = "Nombre: " + nombre + " " + apellido + "\nNumero de telefono: " + numeroTelefono;
        return cadena;
    }
}
