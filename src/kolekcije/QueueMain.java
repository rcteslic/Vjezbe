package kolekcije;

import exeption.Student;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        // PriorityQueue i LinkedList
        // offer vs add--> za dodavanje
        // pool || remove  --> za povlačenje
        // size on peek
        // contains
        // foreach, iteration()
        // 2 opcije generics or not

        Queue<String> listaZaprocesuiranje = new PriorityQueue<>();
        listaZaprocesuiranje.add("bla1");
        listaZaprocesuiranje.add("bla2");
        listaZaprocesuiranje.add("bla3");

        System.out.println("Size before: "+listaZaprocesuiranje.size());

        String peek = listaZaprocesuiranje.poll();

         System.out.println("Size after: "+listaZaprocesuiranje.size());

        System.out.println(listaZaprocesuiranje.size());
    }
}
