package com.platzi.functional._07_inference;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.function.Function;

public class Inferencia {

    public static void main(String[] args) {
        Function<Integer, String> funcionConvertidora =
                integer -> "Al doble: " + (integer * 2);
        System.out.println(funcionConvertidora.apply(5));

        List<String> alumnos = NombresUtils.getList("Maria", "Rebeca", "Diana");
        alumnos.forEach(System.out::print);
    }
}
