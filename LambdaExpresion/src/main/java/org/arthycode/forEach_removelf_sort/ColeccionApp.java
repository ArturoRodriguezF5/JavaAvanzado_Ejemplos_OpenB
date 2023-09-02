package org.arthycode.forEach_removelf_sort;

import java.util.ArrayList;
import java.util.List;

public class ColeccionApp {

    private List<String> lista;

    public void llenarLista() {
        lista = new ArrayList<>();
        lista.add("MitoCode");
        lista.add("Mito");
        lista.add("Code");
    }

    public void userForEach() {
        lista.forEach(System.out::println);
    }

    public void usarRemoverIf() {
        lista.removeIf(x -> x.equals("Mito"));
    }

    public void usarSort() {
        lista.sort(String::compareToIgnoreCase);
    }

    public static void main(String[] args) {
        ColeccionApp app = new ColeccionApp();
        app.llenarLista();
        app.usarRemoverIf();
        app.usarSort();
        app.userForEach();
    }
}
