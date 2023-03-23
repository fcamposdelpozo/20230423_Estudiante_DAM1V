import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class dateMain {
    public static void main(String[] args) {

        // 1. Instanciar un objeto de la clase con el constructor por defecto. Muestra por pantalla la fecha que se ha instanciado.
        Date fecha = new Date ();
        System.out.println(fecha);

        // 2.Instancia una segunda fecha utilizando el constructor al que le pasas los parámetros, año, mes y día. Comprueba y visualiza el resultado.
        Date fecha2 = new Date(2013, 10, 15);
        System.out.println(fecha2);

        // 3. ¿Cuál es la fecha inicial utilizada por la clase Date?
        //La fecha inicial es la fecha que proporciona el sistema en el momento en que se compila el codigo. 

        /* 4. Visualiza las fechas instanciadas utilizando métodos para mostrar formatos distintos. Usa el método para visualizar el método de formato
        local. */

        SimpleDateFormat formateo = new SimpleDateFormat("dd/MM/yy");
        System.out.println(formateo.format(fecha2));

        //5. Utiliza algún método para visualizar cuál de las fechas es anterior a la otra
        Date fecha3 = new Date(34);
        System.out.println(fecha3);
        if(fecha3.after(fecha2) == true){
            System.out.println("La fecha " + fecha3 + " es posterior a la fecha " + fecha2);
        }else{
            System.out.println("La fecha " + fecha2 + " es posterior a la fecha " + fecha3);
        }

    }
}
