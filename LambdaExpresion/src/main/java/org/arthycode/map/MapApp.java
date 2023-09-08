package org.arthycode.map;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

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
        //map.forEach((k, v) -> System.out.println("Llave: " + k + " Valor: " + v));
        map.entrySet().forEach(System.out::println);
    }
    public void recolectar() {
        Map<Integer, String> mapaRecolectado = map.entrySet().stream()
                .filter(x -> x.getValue().contains("Sus"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        mapaRecolectado.forEach((k, v) -> System.out.println("Llave: " + k + " Valor: "+ v));
    }
    public void insertarSiAusente() {
        map.putIfAbsent(5, "Arthy");
    }
    public void operarSiPresent() {
        map.computeIfPresent(5, (k, v) -> v.toUpperCase());
        System.out.println(map.get(5));
    }
    public void obtenerOrPredeterminado() {
        String val = map.getOrDefault(4, "Predeterminado");
        System.out.println(val);
    }

    public static void main(String[] args) {
        MapApp app = new MapApp();
        app.probar();
        //app.insertarSiAusente();
        //app.imprimir_v8();
        //app.operarSiPresent();
        //app.obtenerOrPredeterminado();
        app.recolectar();
    }
}
