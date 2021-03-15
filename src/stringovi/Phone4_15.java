package stringovi;

import java.util.Scanner;

public class Phone4_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().toLowerCase();
        if ("abc".contains(input)) {
            System.out.println(2);
        } else if ("def".contains(input)) {
            System.out.println(3);
        } else if ("ghi".contains(input)) {
            System.out.println(4);
        } else if ("jkl".contains(input)) {
            System.out.println(5);
        } else if ("mno".contains(input)) {
            System.out.println(6);
        } else if ("pqrs".contains(input)) {
            System.out.println(7);
        } else if ("tuv".contains(input)) {
            System.out.println(8);
        } else if ("wxyz".contains(input)) {
            System.out.println(9);
        } else System.out.println("Invalid input");
    }
}
