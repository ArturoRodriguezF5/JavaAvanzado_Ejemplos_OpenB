package recursion.java;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        /*System.out.println("La suma es: " + suma(5));
        tailRecursion(5);
        headRecursion(5);*/
        System.out.println(sumFuncional(5));
    }
    public static int suma(int n) {
        if (n == 1) {
            return 1;
        }
        return n + suma(n - 1);
    }
    public static void tailRecursion(int valor) {
        if (valor == 0) {
            return;
        }
        System.out.println(valor);
        tailRecursion(valor - 1);
    }
    public static void headRecursion(int valor) {
        if (valor == 0) {
            return;
        }
        headRecursion(valor - 1);
        System.out.println(valor);
    }
    public static int sumFuncional(int n) {

        return IntStream.rangeClosed(1, n)
                .reduce(0, (a, b) -> a + b);
    }
}
