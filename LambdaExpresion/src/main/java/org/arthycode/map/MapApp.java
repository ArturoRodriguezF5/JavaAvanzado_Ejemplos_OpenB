package org.arthycode.map;


import java.util.HashMap;
import java.util.Map;

public class MapApp {

    private Map<Integer, String> map;

    public void probar() {
        map = new HashMap<>();
        map.put(1, "Mito");
        map.put(2, "Code");
        map.put(3, "Suscribete");
    }

    public void imprimir_v7() {
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println("Llave: " + e.getKey() + " Valor: " + e.getValue());
        }
    }

    public void imprimir_v8() {
        map.forEach((k, v) -> System.out.println("Llave: " + k + " Valor: " + v));
    }
    public void recolectar() {

    }
    public void insertarSiAusente() {

    }
    public void operarSiAusente() {

    }
    public void obtenerOrPredeterminado() {

    }

    public static void main(String[] args) {
        MapApp app = new MapApp();
        app.probar();
        app.imprimir_v8();
    }
}
