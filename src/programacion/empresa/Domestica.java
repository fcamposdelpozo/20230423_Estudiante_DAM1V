package programacion.empresa;
public class Domestica extends Maquina {
    //Declaro la potencia minima y maxima de estas maquinas
    final int POTENCIA_MINIMA = 30;
    final int POTENCIA_MAXIMA = 200;

    public Domestica(String modelo, int numSerie, int horasFuncionamiento){
        super(modelo, numSerie, horasFuncionamiento);
    }

    public void encender(){
        System.out.println("La maquina domestica se enciende al instante.");
    }

    public void apagar(){
        System.out.println("La maquina domestica se apaga al instante.");
    }

    public String toString(){
        return "Modelo: " + modelo + ".    Numero de Serie: " + numSerie 
        + ".    Horas de funcionamiento: " + horasFuncionamiento;
    }
}
