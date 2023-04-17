package programacion.empresa;

public class Industrial extends Maquina {

    final int POTENCIA_MINIMA = 120;
    final int POTENCIA_MAXIMA = 800;

    private int potenciaConsumo;

    public Industrial(String modelo, int numSerie, int horasFuncionamiento, int potenciaConsumo){
        super(modelo, numSerie, horasFuncionamiento);
        this.potenciaConsumo = potenciaConsumo;
    }

    public void encender() {
        if(potenciaConsumo > POTENCIA_MINIMA && potenciaConsumo < POTENCIA_MAXIMA){
            System.out.println("La maquina industrial ya esta encendida.");
        }

        if(potenciaConsumo > POTENCIA_MAXIMA){
            System.out.println("La maquina industrial se encendera en 5 segundos.");
        }
    }

    public void apagar() {
        if(potenciaConsumo > POTENCIA_MINIMA && potenciaConsumo < POTENCIA_MAXIMA){
            System.out.println("La maquina industrial ya esta apagada.");
        }

        if(potenciaConsumo > POTENCIA_MAXIMA){
            System.out.println("La maquina industrial se apagara en 5 segundos.");
        }
    }

    public String toString(){
        return "Modelo: " + modelo + ".      Numero de serie: " + numSerie + ".    Horas de funcionamiento: " 
        + horasFuncionamiento + ".    Potencia de consumo: " + potenciaConsumo;
    }
    
}
