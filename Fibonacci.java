import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero;
        int num = Integer.parseInt(args[0]);
        int result = Fibonacci(num);

        System.out.println("El Fibonacci de " + args[0] + " es igual a " + result);

    }

    public static int Fibonacci(int numero) {

        if (numero == 0) {
            return 0;
        }

        if (numero == 1) {
            return 1;
        }

        return numero = Fibonacci(numero - 1) + Fibonacci(numero - 2);
    }
}
