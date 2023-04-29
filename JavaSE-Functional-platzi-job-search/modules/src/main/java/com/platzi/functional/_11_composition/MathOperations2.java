package com.platzi.functional._11_composition;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Function;

public class MathOperations2 {
    public static void main(String[] args) {

        Function<Integer, Integer> multiplyByThree = x -> x * 3;
        Function<Integer, Integer> add1MultiplyByThree =
                multiplyByThree.compose(y -> {
                    System.out.println("Le agregaré 1 a: " + y);
                    return y + 1;
                });
        Function<Integer, Integer> andSquare =
                add1MultiplyByThree.andThen(x -> {
                    System.out.println("Estoy elevando el numero: " + x + "al cuadrado.");
                    return x * x;
                });

        System.out.println(add1MultiplyByThree.apply(5));
        System.out.println(andSquare.apply(5));
    }
}
