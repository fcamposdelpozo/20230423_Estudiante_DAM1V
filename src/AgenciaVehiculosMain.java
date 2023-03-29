import programacion.empresa.Automovil;
import programacion.empresa.Camion;
import programacion.empresa.Vehiculo;

public class AgenciaVehiculosMain {
    public static void main(String[] args) {

            Automovil Toyota = new Automovil("Toyota", "Corolla", 2019, 5);
            Camion Ford = new Camion("Ford", "F-150", 2020, 4000);
            Vehiculo Fiat = new Vehiculo("Fiat", "Punto", 2017);

            System.out.println(Toyota);
            System.out.println();
            System.out.println();
            System.out.println(Ford);

            //HACER CASTING DE OBJETOS
            Automovil newAutomovil = (Automovil) Fiat;
    }
}
