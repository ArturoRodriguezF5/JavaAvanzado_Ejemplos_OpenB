package funcional;

public class Main {
    //private static int contador = 0;
    public static void main(String[] args) {
        // Se invoca a la función pura, una función pura es aquella que siempre produce la misma salida.
        int res1 = suma(5, 2);
        int res2 = suma(5, 2);
        System.out.println(res1 + " " + res2);
    }
    public static int suma(int a, int b) {
        // Si el resultado depende de algo fuera de la fucnion, no es PURA.
        //contador++;
        return a + b;
    }
    public static int multiplicacion(int a, int b) {
        return a * b;
    }
}
