package org.arthycode.defaultmethods;

public class DefaultMethods implements PersonaA, PersonaB{


    @Override
    public void caminar() {
        System.out.println("Hola...");
    }

    @Override
    public void hablar() {
        //PersonaB.super.hablar();
        System.out.println("Hola sobreescribiendo el método...");
    }


    public static void main(String[] args) {

        DefaultMethods defaultMethods = new DefaultMethods();
        defaultMethods.caminar();
        defaultMethods.hablar();
    }

}
