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
public class FibonacciArreglo {
    public static void main(String[] args) {
        int[] serie = generarFibonacci(10);
        for (int num : serie) {
            System.out.print(num + " ");
        }
    }

    public static int[] generarFibonacci(int n) {
        if (n <= 0) return new int[0];
        
        int[] fib = new int[n];
        fib[0] = 0;
        if (n == 1) return fib;
        
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib;
    }
}
