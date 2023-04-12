package programacion.empresa;
public abstract class Maquina {

    //El numero de serie debe estar entre estos dos numeros
    final int MIN_NUMSERIE = 1000;
    final int MAX_NUMSERIE = 9999;

    //Declaramos las variables que comparten todas las clases
    private String modelo;
    private int numSerie;
    private int horasFuncionamiento;
}
