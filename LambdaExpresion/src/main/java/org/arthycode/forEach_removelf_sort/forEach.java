package org.arthycode.forEach_removelf_sort;

import java.util.ArrayList;
import java.util.List;

public class forEach {

    public static void main(String[] args) {

        List<String> paises = new ArrayList<>();
        paises.add("Mexico");
        paises.add("Canada");
        paises.add("France");
        paises.add("Germany");
        paises.add("United States");

        paises.forEach(System.out::println);

        System.out.println(paises);
        paises.removeIf(x -> x.equals("France"));
        System.out.println(paises);
        paises.sort(String::compareTo);
        paises.forEach(System.out::print);
    }
}
