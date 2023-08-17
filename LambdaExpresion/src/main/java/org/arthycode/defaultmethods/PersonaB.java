package org.arthycode.defaultmethods;

public interface PersonaB {

    default public void hablar() {
        System.out.println("Hblando... PB");
    }
}
