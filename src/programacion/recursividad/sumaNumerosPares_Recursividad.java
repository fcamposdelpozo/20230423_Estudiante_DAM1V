package programacion.recursividad;
public class sumaNumerosPares_Recursividad {

    int num1;
    int num2;
    int suma;

    public sumaNumerosPares_Recursividad(){

    }

    public int sumaValoresPares(int num1, int num2){

        if (num1 > num2) {
            return 0;
        } else if (num1 % 2 != 0) {
            suma = sumaValoresPares(num1+1, num2);
        } else {
            suma = num1 + sumaValoresPares(num1+2, num2);
        }
        return suma;
    }

    public int getSuma(){
        return suma;
    }
    
}
