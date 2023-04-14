package funcional;

public class Main {
    private static int contador = 0;
    public static void main(String[] args) {

        int res1 = suma(5, 2);
        int res2 = suma(5, 2);
        System.out.println(res1 + " " + res2);
    }
    public static int suma(int a, int b) {
        contador++;
        return a + b;
    }
    public static int multiplicacion(int a, int b) {
        return a * b;
    }
}
