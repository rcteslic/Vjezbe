package VjezbeGenerics;
// Enum
// Generics
// Strimovi

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class NumberContainer<T extends Number> {
    T num;

    public NumberContainer(T num) {
        this.num = num;
    }

    public boolean isEqual(NumberContainer<?> obj) {
        System.out.println(Math.abs(num.doubleValue()));
        System.out.println(Math.abs(obj.num.doubleValue()));
        return Math.abs(num.doubleValue()) == Math.abs(obj.num.doubleValue());
    }
}

class Student {
    String ime;
    int godine;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public Student(String ime, int godine) {
        this.ime = ime;
        this.godine = godine;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", godine=" + godine +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        NumberContainer<Integer> container = new NumberContainer(5);
        NumberContainer<Double> containerD = new NumberContainer(5.9);
        boolean isti = container.isEqual(containerD);
        System.out.println("Bla...." + isti);

        Student student1 = new Student("Bojan", 33);
        List<Student> listaStudenata = Arrays.asList(
                student1,
                new Student("Simo", 19),
                new Student("Aco", 22),
                new Student("Aco", 34),
                new Student("Aco", 11));
        List<Student> studIspod23 = new ArrayList<>();
        for (Student s : listaStudenata) {
            if (s.godine > 23) {
                studIspod23.add(s);
            }
        }
        System.out.println("Clasicni pristup " + studIspod23);
        List<Student> over23 = listaStudenata.stream()
                .filter(student -> student.godine > 23)
                .collect(Collectors.toList());

        System.out.println("Stream " + over23);

        System.out.println("Svi preko 23");
        //svipreko23.forEach(System.out::println);

        System.out.println("Lista mapiranih imena");
        List<String> listaImena =
                listaStudenata.stream()
                        .map(student -> student.ime)
                        .collect(Collectors.toList());

        System.out.println("Sortiranje niza po imenu");

        Comparator<Student> sortiranjePOImenu = Comparator.comparing(Student::getIme);
        Comparator<Student> sortPoGodinama = Comparator.comparing(Student::getGodine);

        listaStudenata.stream()
                .sorted(
                        sortiranjePOImenu.thenComparing(sortPoGodinama))
                .forEach(System.out::println);
    }
}
