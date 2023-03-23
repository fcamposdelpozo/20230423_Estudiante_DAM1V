import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarMain {
    public static void main(String[] args) {

        // 1. Instancia 2 objetos de la clase utilizando distintos constructores.

        GregorianCalendar fecha1 = new GregorianCalendar();
        GregorianCalendar fecha2 = new GregorianCalendar(2012, 9, 28);
        System.out.println(fecha1);
        System.out.println(fecha2); 

        // 2. Utilizando el método get para obtener los valores de los distintos FIELD, muestra la información de alguna de las fechas instanciadas.
        //System.out.println(fecha1.getTimeZone());
        fecha2.get(2); 

        //No entiendo bien el uso de este metodo(get). 
        
        // 4. Calcular el tiempo transcurrido entre las dos fechas.
        long diferenciaEnMilisegundos = fecha1.getTimeInMillis() - fecha2.getTimeInMillis();
        long diasTranscurridos = diferenciaEnMilisegundos / (24 * 60 * 60 * 1000);
        System.out.println("Días transcurridos: " + diasTranscurridos);

        //Dar formato a fecha GregorianCalendar
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
        String fechaFormateada = formato.format(fecha2.getTime());
        System.out.println(fechaFormateada);

        //5. Comprobar si el año de una fecha es bisiesto
        GregorianCalendar yearBisiesto = new GregorianCalendar();
        int anio = 2012;

        System.out.println("*****************************");
        System.out.println();
        if (yearBisiesto.isLeapYear(anio) == true){
            System.out.println("El año " + anio + " es bisiesto.");
        }else{
            System.out.println("El año " + anio + " no es bisiesto");
        }

        //6. Sumar y restar valores al día, mes o año de una fecha.
        fecha2.add(Calendar.DAY_OF_MONTH, 23);
        System.out.println("La fecha " + fechaFormateada + " sumando veintitres dias es igual a: " + fecha2.getTime());
    }
}
