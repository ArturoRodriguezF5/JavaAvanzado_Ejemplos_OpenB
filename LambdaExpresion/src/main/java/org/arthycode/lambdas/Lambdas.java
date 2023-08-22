package org.arthycode.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Lambdas {

    public static void main(String[] args) {

        List<Double> nums = new ArrayList<>();
        nums.add(1.0);
        nums.add(2.0);
        nums.add(3.0);
        nums.add(4.0);
        nums.add(5.0);

        nums.stream().map(x -> x + 1).forEach(System.out::println);

        List<String> frutas = new ArrayList<>();

        frutas.add("Sandia");
        frutas.add("Fresa");
        frutas.add("Uva");

        frutas.stream().map(x -> {
           return  "La: " + x;
        }).forEach(System.out::println);

    }
}