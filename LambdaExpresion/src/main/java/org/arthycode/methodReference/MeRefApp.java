package org.arthycode.methodReference;


public class MeRefApp {
    public static void referenciarMetodoStatic() {
        System.out.println("Método referido static");
    }

    public void referenciarMetodoInstanciaObjetoArbitrario() {

    }
    public void referenciarMetodoInstanciaObjetoParticular() {

    }
    public void referenciarConstructor() {

    }

    public void operar() {
        Operacion op = () -> MeRefApp.referenciarMetodoStatic();
        op.saludar();
    }

    public static void main(String[] args) {
        MeRefApp app = new MeRefApp();
        app.operar();
    }
}
