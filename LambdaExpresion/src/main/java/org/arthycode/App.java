package org.arthycode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public void ordenar() {
        List<String> lista = new ArrayList<String>();
        lista.add("MitoCode");
        lista.add("Mito");
        lista.add("Code");

//        Collections.sort(lista, new Comparator<String>() {
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });

        Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));

        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
    public static void main( String[] args ) {
        App app = new App();
        app.ordenar();

    }
}
