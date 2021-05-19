package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainStreams {
    public static void main(String[] args) {
        List<People> peoples = Arrays.asList(
                new People(42, "A"),
                new People(22, "A"),
                new People(22, "C"),
                new People(25, "B"));

        peoples.forEach(people -> {
            if (people.getName().equals("A")) {
                System.out.println(people);
            } else {
                System.out.println("Nije sa A");
            }
        });
        // peoples.forEach(System.out::println);
        System.out.println("Filtriranje: ");
        List<People> peoplesUnder10 = peoples.stream().
                filter(people -> people.getName().startsWith("A")).collect(Collectors.toList());

        peoplesUnder10.forEach(System.out::println);
        System.out.println("Filtriranje pronadji prvog: ");
        People people = peoples.stream().filter(p -> p.getName().startsWith("A")).findFirst().orElse(null);
        System.out.println("firist: " + people);

        //
        System.out.println("Sorted collect to list: ");
        List<People> peoplesSorted = peoples.stream().
                sorted(Comparator.comparing(People::getAge)
                        .thenComparing(People::getAge))
                .collect(Collectors.toList());

        peoplesSorted.forEach(System.out::println);

        Comparator<People> peopleComparatorByName = Comparator.comparing(People::getName).reversed();
        Comparator<People> peopleComparatorByAge = Comparator.comparing(People::getAge).reversed();

        System.out.println("Sorted, ispis-->: ");
        peoples.stream().
                sorted(peopleComparatorByName.thenComparing(peopleComparatorByName.thenComparing(peopleComparatorByAge)))
                .forEach(System.out::println);


        System.out.println("Match, anyMatch");

        boolean b = peoples.stream().anyMatch(people1 -> people1.age > 22);
        System.out.println("Match--> " + b);

        System.out.println("Count");
        long count = peoples.stream().filter(people1 -> people1.age > 20).count();
        System.out.println("Br over 20: " + count);

        System.out.println("Map");
        List<String> imena1 = peoples.stream().map(people1 -> people1.getName().toLowerCase()).collect(Collectors.toList());


        People p0 = new People(34, "Drago");
        People p1 = new People(35, "Dero");
        People p2 = new People(34, "Pero5");

        List<People> ljudi = Arrays.asList(p0, p1, p2);

        ljudi.forEach(covjek -> System.out.println(covjek.getAge()));

        List<String> imena = ljudi.stream().map(People::getName).collect(Collectors.toList());

        imena.forEach(ime -> {
            if (ime.startsWith("P")) {
                System.out.println("POČINJE sa slovom P" + ime);
            } else {
                System.out.println("NE POČINJE sa slovom P" + ime);
            }
        });
        Comparator<People> byAge = Comparator.comparing(People::getAge);
        Comparator<People> byName = Comparator.comparing(People::getName);

        peoples.stream()
                .sorted(byAge.reversed().thenComparing(byName))
                .forEach(System.out::println);

        boolean contains = peoples.stream().allMatch(people1 -> people1.age>23);
        System.out.println(contains);

    }

    private static boolean uslov(People pr) {
        return pr.getName().startsWith("");
    }


    static class People {
        int age;
        String name;

        public People(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "People{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
