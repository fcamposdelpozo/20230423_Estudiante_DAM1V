import programacion.EjerciciosDePractica.Administrador;

public class ComunidadVecinosMain {
    public static void main(String[] args) {
        Administrador administrador1 = new Administrador("34242", "Arganzuela", 123, "Alfonso Perez", "11850490Q", 54);
        
        System.out.println(administrador1);

        /* if(administrador1.dniValido() == true){
            System.out.println("Los datos del administrador son correctos.");
        }else{
            System.out.println("Los datos del administrador son incorrectos.");
        } */
    }
}
