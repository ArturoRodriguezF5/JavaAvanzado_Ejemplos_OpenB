package org.arthycode.methodReference;


import java.util.Arrays;
import java.util.Comparator;

public class MeRefApp {
    public static void referenciarMetodoStatic() {
        System.out.println("Método referido static");
    }

    public void referenciarMetodoInstanciaObjetoArbitrario() {
        String[] nombres = {"Mito", "Code", "Jaime"};
        /*Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });*/
        /*Arrays.sort(nombres, (s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(Arrays.toString(nombres));*/
        Arrays.sort(nombres, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(nombres));
    }
    public void referenciarMetodoInstanciaObjetoParticular() {
        System.out.println("Método referido de instancia de clase");
    }
    public void referenciarConstructor() {

    }

    public void operar() {
        /*Operacion op = () -> MeRefApp.referenciarMetodoStatic();
        op.saludar();*/

        Operacion op2 = MeRefApp::referenciarMetodoStatic;
        op2.saludar();



    }

    public static void main(String[] args) {
        MeRefApp app = new MeRefApp();
        //app.operar();
        //app.referenciarMetodoInstanciaObjetoArbitrario();
        Operacion op = app::referenciarMetodoInstanciaObjetoParticular;
        op.saludar();
    }
}
