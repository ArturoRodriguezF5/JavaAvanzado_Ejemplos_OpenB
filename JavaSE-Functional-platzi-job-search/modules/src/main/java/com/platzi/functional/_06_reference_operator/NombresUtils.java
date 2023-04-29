package com.platzi.functional._06_reference_operator;

import java.util.Arrays;
import java.util.List;

public class NombresUtils {
    public static void main(String[] args) {
        List<String> nombres = getList("Nicolas", "Julia", "Zulema");
        nombres.forEach(System.out::println);
    }
     public  static <T> List<T> getList(T... elements) {
        return Arrays.asList(elements);
    }
}
