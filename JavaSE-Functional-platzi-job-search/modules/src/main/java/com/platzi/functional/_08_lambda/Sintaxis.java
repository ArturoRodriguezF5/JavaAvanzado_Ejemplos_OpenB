package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.function.BiFunction;

public class Sintaxis {
    public static void main(String[] args) {

        List<String> cursos = NombresUtils.getList("Java", "Functional");
        cursos.forEach(curso -> System.out.print(curso));
        BiFunction<Integer, Integer, Integer> s = Integer::sum;


    }
}
