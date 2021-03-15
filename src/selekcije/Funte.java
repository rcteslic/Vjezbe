package selekcije;

import java.util.Scanner;

public class Funte {
    /*  Napisati program koji pita korisnika da unese neki iznos u funtama.
  
      Nakon što korisnik unese iznos u funtama, program ispisuje isti iznos
      u konvertibilnim markama.
  
      Uzmimo da je £1 = 2.20 BAM.*/
    public static void main(String[] args) {
        int brojGodina = 27;
        double v;
        boolean muskaOsoba = true;
            // true    i
        if(!muskaOsoba){
            System.out.println("Osoba je muskog pola");
        }
        else {
            System.out.println("Osoba je zenskog pola");
        }


      //  System.out.println("muskaOsoba = " + muskaOsoba);
      //  System.out.println("brojGodina = " + brojGodina);
        
        
        
        
        
        
        
        
        
        
        double kursFunte = 2.20;
        double rezultat = 0;
        Scanner scanner = new Scanner(System.in);
      //  System.out.print("Unesite neki iznos u funtama: ");
        double funte = scanner.nextDouble();
        rezultat = funte * kursFunte;

        System.out.println("To odgovara vrjednosti od " + rezultat + " BAM");


    }
}
