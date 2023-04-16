package funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.IntStream;

public class LambdasRepaso {
    // Creamos una función lambda
    private static Function<String, String> toLower = x -> x.toLowerCase();
    public static void main(String[] args) {

        // Mandamos a llamar la función
        System.out.println(toLower.apply("COSITO"));
        // Creamos una función con uso de prog funcional

        ArrayList<String> platillos = new ArrayList<>();
        platillos.add("Chilaquiles");
        platillos.add("Camarones al mojo de ajo");
        platillos.add("Enchiladas");
        platillos.add("Carne con chile");
        platillos.add("Enchiladas verdes");
        platillos.add("Entomatada");


        platillos.stream().map(x -> x.toUpperCase())
                .filter(x -> x.startsWith("E") && x.endsWith("S"))
                .forEach(x -> System.out.println(x));
        // Ahora guardando en una variable especial
        int[] nums = {23, 12, 34, 566, 1345, 455, 21, 238726, 23671256, 61267};
        // Creamos una variable especial para poder aplicar prog funcional
        IntStream inInt = Arrays.stream(nums);
        int may = inInt.reduce(5, (x, y) -> {
            int mayor;
            if (x < y) {
                mayor = y;
            } else {
                mayor = x;
            }
            return mayor;
        });
        System.out.println("El numero mayor es: " + may);

    }
}
