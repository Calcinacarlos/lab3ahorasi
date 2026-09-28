import java.util.Scanner;

public class Fibonacci {
    static void imprimirSerie(int n, int actual, int siguiente) {
        if (n <= 0) {
            return; 
        }

        System.out.print(actual + " ");
        imprimirSerie(n - 1, siguiente, actual + siguiente);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántos términos quieres mostrar? ");
        int cantidad = entrada.nextInt();

        imprimirSerie(cantidad, 0, 1);
        entrada.close();
    }
}