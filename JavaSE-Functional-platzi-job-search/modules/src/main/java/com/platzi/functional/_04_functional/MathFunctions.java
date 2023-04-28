package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {

    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<Student> isApproved = student -> student.getCalificacion() >= 6;

        System.out.println(square.apply(5));
        System.out.println(isEven.test(10));
        System.out.println(isApproved.test(new Student(8)));

    }

    static class Student {
        private double calificacion;

        public Student(double calificacion) {
            this.calificacion = calificacion;
        }
        public double getCalificacion() {
            return calificacion;
        }
    }
}
