package com.platzi.functional._14_optionals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Optionals2 {

    public static void main(String[] args) {
    if (getOptionalNames().isPresent()) {
        System.out.println("Si existe algo...");
    } else {
        System.out.println("No hay nada...");
    }

    }
    static Optional<List<String>> getOptionalNames() {
        List<String> names = new ArrayList<>();
        names.add("Arturo");
        return Optional.of(names);
    }
    static Optional<String> getOptionalValuable() {

        return Optional.empty();
    }
}
