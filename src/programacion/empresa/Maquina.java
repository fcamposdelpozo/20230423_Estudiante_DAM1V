package programacion.empresa;
public abstract class Maquina {

    //El numero de serie debe estar entre estos dos numeros
    final int MIN_NUMSERIE = 1000;
    final int MAX_NUMSERIE = 9999;
    
    //Declaramos las variables que comparten todas las clases
    String modelo;
    int numSerie;
    int horasFuncionamiento;

    //Declaramos el constructor de la clase super
    public Maquina(String modelo, int numSerie, int horasFuncionamiento){
        this.modelo = modelo;
        this.numSerie = numSerie;
        this.horasFuncionamiento = horasFuncionamiento;
    }

    //Declaramos dos metodos que seran comunes a todas las maquinas
    public abstract void encender();
    public abstract void apagar();

}
