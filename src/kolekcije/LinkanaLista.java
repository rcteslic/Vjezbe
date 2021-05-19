package kolekcije;

import java.util.LinkedList;

public class LinkanaLista {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");

        System.out.println(ll);

        boolean b = ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.print(ll);

        ll.add(1, "For");
        System.out.println(ll);
        ll.set(1, "For3");
        System.out.println(ll);

        for (int i = 0; i > ll.size(); i++) {
            System.out.println(ll.get(i));
        }

    }
}
