package recursion.java;

import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Factorial de " + n + " : " + recursivaFactorial(n));
        System.out.println("Factorial de " + n + " : " + factorialFuncional(n));
        System.out.println("Factorial de " + n + " : " + iterativeFactorial(n));
    }
    // Funcion recursiva para sacar factorial
    public static int recursivaFactorial(int n) {
        if (n == 0) return 1;
        return n * recursivaFactorial(n - 1);
    }
    // Funcion funcional para sacar el factorial de un numero
    public static int factorialFuncional(int n) {
        return IntStream.rangeClosed(1, n).reduce(1, (x, y) -> {
            System.out.println("Valor de x: " + x + " Valor de y: " + y);
            return x * y;
        });
    }
    // Funcion iterativa para sacar factorial de un numero
    public static int iterativeFactorial(int n) {
        int fact = n;
        n--;
        while (n > 0) {
            fact = fact * n;
            n--;
        }
        return fact;
    }
}
