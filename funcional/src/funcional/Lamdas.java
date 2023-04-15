package funcional;

import java.util.Locale;
import java.util.function.Function;

public class Lamdas {
    private static Function<String, String> toMayus = x -> x.toUpperCase();
    private static Function<Integer, String> toStringg = x -> x.toString();
    public static void main(String[] args) {

        System.out.println(toMayus.apply("Arturo"));
        System.out.println(toStringg.apply(5));
    }
    public static String diHola(String nombre) {
        return "Hola: " + nombre;
    }
}
