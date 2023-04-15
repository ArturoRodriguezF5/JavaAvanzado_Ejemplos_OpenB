package funcional;

import java.util.ArrayList;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

public class Lamdas {
    private static Function<String, String> toMayus = x -> x.toUpperCase();
    private static Function<Integer, String> toStringg = x -> x.toString();
    public static void main(String[] args) {

        System.out.println(toMayus.apply("Arturo"));
        System.out.println(toStringg.apply(5));

        // Creamos un ArraList y llenamos con nombres aleatorios
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Arturo");
        nombres.add("Katya");
        nombres.add("Jenny");

        Stream<String> valores = nombres.stream().map(x -> x.toUpperCase());
        valores.forEach(x -> System.out.println(x));
    }
    public static String diHola(String nombre) {
        return "Hola: " + nombre;
    }
}
