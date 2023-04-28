package com.platzi.functional._04_functional;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class StringFunctions {

    public static void main(String[] args) {
        UnaryOperator<String> quote = texto -> "\"" + texto + "\"";
        BiFunction<Integer, Integer, Float> biFun = (x, y) ->(float) x * y;
        BiFunction<String, Integer, String> addEspacios = (x, y) -> {
            for (int i = 1; i < y; i++) {
                x += " ";
            }
            return x;
        };
        BiFunction<String, Integer, String> leftPad =
                (text, number) -> String.format("%" + number + "s", text);


        System.out.println(quote.apply("Arturo"));
        System.out.println(biFun.apply(5, 4));
        System.out.println(addEspacios.apply("Hola", 15) + "F");
        System.out.println(leftPad.apply("Java", 10));
    }
}
