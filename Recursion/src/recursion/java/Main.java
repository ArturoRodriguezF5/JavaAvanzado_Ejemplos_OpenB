package recursion.java;

public class Main {
    public static void main(String[] args) {

        System.out.println("La suma es: " + suma(5));
    }
    public static int suma(int n) {
        if (n == 1) {
            return 1;
        }
        return n + suma(n - 1);
    }
    public static void tailRecursion(int valor) {

    }
}
