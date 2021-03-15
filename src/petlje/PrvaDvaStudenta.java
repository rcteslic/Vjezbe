package petlje;

import java.util.Scanner;

public class PrvaDvaStudenta {
    /*(Find the two highest scores)
    Write a program that prompts the user to enter the number of students
    and each student’s name and score,

    and finally displays the
    student with the highest score and the student with the second-highest score.*/


    public static void main(String[] args) {
        System.out.println("Unesite br studenata: ");
        Scanner scanner = new Scanner(System.in);
        int brStudenata = scanner.nextInt();
        String prviStudent = "";
        String drugiStudent = "";
        int brBodovaPrvi = 0; //10
        int brBodovaDrugi = 0;
        //5
        for (int i = 0; i < brStudenata; i++) { //0 , 1, 2
            System.out.println("Unseite ime studenta:");
            String uneseniStudent = scanner.next();// Simo  // Pero // Cedo
            System.out.println("Unesite br bodova:");
            int brojUnesenihBodova = scanner.nextInt(); // 5  //  10 // 8
            if (brojUnesenihBodova > brBodovaPrvi) {
                // prebacivanje prvog na drugo mjesto i ime i bodovi
                drugiStudent = prviStudent;
                brBodovaDrugi = brBodovaPrvi;

                // zauzimanje prvog mjesta
                prviStudent = uneseniStudent;
                brBodovaPrvi = brojUnesenihBodova;

            } else if (brojUnesenihBodova > brBodovaDrugi) {
                brBodovaDrugi = brojUnesenihBodova;
                drugiStudent = uneseniStudent;
            }


        }
        System.out.println("prviStudent = " + prviStudent);
        System.out.println("brBodovaPrvi = " + brBodovaPrvi);
        System.out.println("drugiStudent = " + drugiStudent);
        System.out.println("brBodovaDrugi = " + brBodovaDrugi);
    }
}
