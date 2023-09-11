package org.arthycode.highorder;

import java.util.function.Function;

public class HighOrderApp {

    private Function<String, String> convertirMayusculas = String::toUpperCase;
    private Function<String, String> convertirMinusculas = String::toLowerCase;

    public void imprimir(Function<String, String> function, String valor) {
        System.out.println(function.apply(valor));
    }
    public Function<String, String> mostrar(String mensaje) {
        return (String x) -> mensaje + x;
    }
    public static void main(String[] args) {
        HighOrderApp app = new HighOrderApp();
        app.imprimir(app.convertirMayusculas, "Arthy");
        app.imprimir(app.convertirMinusculas, "RSddd");
        String rspta = app.mostrar("Hola").apply("Gato");
        System.out.println(rspta);
    }
}
