package org.arthycode.parallelstreams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreams {

    private List<Integer> numeros;

    public void llenar() {
        numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }
    }
    public void probarStream() {
        numeros.forEach(System.out::println);
    }
    public void probarParalelo() {
        numeros.parallelStream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        ParallelStreams app = new ParallelStreams();
        app.llenar();
        app.probarStream();
        app.probarParalelo();
    }
}
