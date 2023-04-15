package funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lambdas {
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
        nombres.add("Ariana");

        Stream<String> valores = nombres.stream().map(x -> x.toUpperCase())
                .filter(x -> x.startsWith("A") && x.endsWith("A"));
        valores.forEach(x -> System.out.println(x));

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntStream inNums = Arrays.stream(numbers);
        int res =  inNums.filter(x -> x % 2 == 0).reduce(0, (x, y) -> {
            System.out.println("X es: " + x + " Y es: " + y);
            return x + y;
        });
        System.out.println("Mi suma de pares es: " + res);

    }
}
