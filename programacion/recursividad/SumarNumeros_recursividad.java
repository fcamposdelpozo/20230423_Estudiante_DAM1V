package programacion.recursividad;

public class SumarNumeros_recursividad {
    int suma = 0;

    public SumarNumeros_recursividad(){
    }

    public int SumaRecursiva(int n){

        if(n == 1){
             suma = 1;
             return suma;
        }else{
            suma = suma + (n + SumaRecursiva(n - 1));
            return suma;
        }
    }

    public int getSuma(){
        return suma;
    }
}
