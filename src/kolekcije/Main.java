package kolekcije;

import exeption.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Pero", "Peric", 34);
        Student student2 = new Student("Pero", "Peric", 34);

        System.out.println("== "+(student == student2));
        System.out.println("eq "+student.equals(student2));

        System.out.println("stud. has "+student.hashCode());
        System.out.println("stud2 has "+student2.hashCode());
        // List vs Set(duplicate el)
        //    List<Integer> k2 = new ArrayList();
        Set<Integer> k2 = new HashSet<>();
        k2.add(123);
        k2.add(23);
        k2.add(33);
        k2.add(43);
        k2.add(53);
        Iterator<Integer> iterator = k2.iterator();
        while (iterator.hasNext()) {
            int x = iterator.next();
            System.out.println(x);
        }

        if (student == student2) {
            System.out.println("==");
        } else System.out.println("!=");
    }
}
