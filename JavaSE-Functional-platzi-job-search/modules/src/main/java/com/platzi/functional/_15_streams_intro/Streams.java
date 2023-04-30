package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        List<String> curseList = NombresUtils.getList("Java",
                "FrontEnd",
                "BackEnd",
                "FullStack");
        for (String curso : curseList) {
            System.out.println("Platzi: " + curso);
        }
        Stream<String> coursesStream = Stream.of("Java",
                "FrontEnd",
                "BackEnd",
                "FullStack");
        Stream<Integer> courseLenghtStream = coursesStream.map(curse -> curse.length());

        Optional<Integer> longest = courseLenghtStream.max((x, y) -> y - x);
        Stream<String> coursesStream2 = Stream.of("Java",
                "FrontEnd",
                "BackEnd",
                "FullStack");
        coursesStream2.map(curse -> curse + "!!").forEach(System.out::println);
        Stream<String> coursesStream3 = Stream.of("Java",
                "Java Script",
                "FrontEnd",
                "BackEnd",
                "FullStack");
        System.out.println("Coincidencia con Java.");
        coursesStream3.filter(curse -> curse.contains("Java")).forEach(System.out::println);
    }
}
