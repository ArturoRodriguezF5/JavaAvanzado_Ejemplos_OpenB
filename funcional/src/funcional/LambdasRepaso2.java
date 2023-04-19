package funcional;

import java.util.ArrayList;
import java.util.Locale;
import java.util.function.Function;

public class LambdasRepaso2 {

    // Creamos una función pura
    private static Function<Integer, String> toStringg = Object::toString;
    public static void main(String[] args) {

        // Llamamos a la función con uso de Apply
        System.out.println("El valor string del número pasado es: " + toStringg.apply(23));
        // Creamos un ArrayList para hacer uso de lambda
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Jazmin");
        nombres.add("Carolina");
        nombres.add("Arianna");
        nombres.add("Yenni");
        nombres.add("Montse");

        nombres.stream().map(String::toLowerCase)
                .filter(x -> x.startsWith("a") && x.endsWith("a"))
                .forEach(System.out::print);
        System.out.println("\n");
        // Otra forma de ver la Lambda
        ArrayList<String> nombres2 = new ArrayList<>(nombres);
        nombres2.stream().map(x -> {
            return x.length() == 5? x.toLowerCase() : x.toUpperCase();
        }).forEach(System.out::print);

    }
}
