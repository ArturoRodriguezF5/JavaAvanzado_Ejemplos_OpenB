package recursion.java;

import java.util.stream.IntStream;

/**
 * Clase para hacer ejercicio sobre funciones recursivas
 */
public class RecursionPropio {
    public static void main(String[] args) {
        // Invocamos las funciones recursivas
        tailRecursive(5);
        headRecursion(5);
        System.out.println("La suma es: " + suma(5));

    }
    // Funcion recursiva de tipo TailRecursion
    public static void tailRecursive(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        tailRecursive(n -1 );
    }
    // Función recursiva de tipo HeadRecursion
    public static void headRecursion(int n) {
        if (n == 0) {
            return;
        }
        headRecursion(n -1 );
        System.out.println(n);
    }
    // Función recursiva aplicando funcional
    public static int suma(int n) {
        return IntStream.rangeClosed(1, n).reduce(0, (a, b) -> {
            System.out.println("Valor a: " + a + " Valor b: " + b);
            return a + b;
        });
    }
}
