package org.arthycode.anotaciones;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AnotacionesApp {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface  Lenguajes {
        Lenguaje[] value() default {};
    }
    @Repeatable(value = Lenguajes.class)
    public @interface  Lenguaje {
        String value();
    }

    /* 1.7
    @Lenguajes({
            @Lenguaje(value = "Java"),
            @Lenguaje(value = "Python")
    })*/
    @Lenguaje(value = "Java")
    @Lenguaje(value = "Python")
    public interface  LenguajeProgramacion {

    }
    public static void main(String[] args) {
        Lenguaje[] lenguajeArray = LenguajeProgramacion.class.getAnnotationsByType(Lenguaje.class);
        System.out.println("Cantidad de lenguajes: " + lenguajeArray.length);

        Lenguajes len = LenguajeProgramacion.class.getAnnotation(Lenguajes.class);
        for (Lenguaje ele : len.value()) {
            System.out.println(ele.value());
        }
    }
}
