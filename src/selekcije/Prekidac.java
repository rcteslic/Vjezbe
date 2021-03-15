package selekcije;

import java.util.Scanner;

public class Prekidac {
    public static void main(String[] args) {
        // Od korisnika da unese neki broj izmedju 1 i 7
        // pralelno tome ispisite dan u sedmici

        Scanner scanner = new Scanner((System.in));
        // int dan = scanner.nextInt();

        int dan = 10;
        switch (dan) {
            case 1: {
                System.out.println("PONEDELJAK");
                break;
            }
            case 2: {
                System.out.println("UTORAK");
                break;
            }
            case 3: {
                System.out.println("SRJEDA");
                break;
            }
            case 4: {
                System.out.println("CET");
                break;
            }
            case 5: {
                System.out.println("PETAK");
                break;
            }
            case 6: {
                System.out.println("SUB");
                break;
            }
            case 7: {
                System.out.println("NED");
                break;
            }
            case 10:{
                System.out.println("dan 10 ???");
                break;
            }
            default:{
                System.out.println("Niste unejli broj 1-7");
            }
        }

    }
}
