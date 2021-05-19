package kolekcije;

import exeption.Student;

import java.util.*;

public class Setovi {
    public static void main(String[] args) {
        Set<Integer>  integers = new HashSet<>();
        integers.add(45);
        integers.add(34);
        integers.add(38);
        integers.add(4);
        System.out.println(integers);

        List<Integer> lista = new ArrayList<>();
        lista.add(45);
        lista.add(34);
        lista.add(38);
        lista.add(4);
        System.out.println(lista);


    }
}
