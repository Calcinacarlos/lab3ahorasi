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