package org.arthycode.defaultmethods;

public interface PersonaA {

    public void caminar();

    default public void hablar() {
        System.out.println("Hblando...PA");
    };
}
