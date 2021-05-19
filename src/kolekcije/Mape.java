package kolekcije;

import exeption.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mape {
    public static void main(String[] args) {
        Map<String, Student> telefonskiImenik = new HashMap<>();

        Student student = new Student("Pero", "Peric", 34);
        Student student2 = new Student("Milos", "Simić", 3);
        Student student3 = new Student("Dragan", "Dragic", 54);

        telefonskiImenik.put("Pero", student);
        telefonskiImenik.put("Milos", student2);
        telefonskiImenik.put("Drago", student3);


        Set<String> keys = telefonskiImenik.keySet();

        for (String key : keys) {
            Student s = telefonskiImenik.get(key);
            if (s.getScore() > 3) {
            }
        }
    }

}
