package exeption;

import java.util.Scanner;

public class Dijeljenje {
    public void podjeli() throws ArithmeticException {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite dva cijela broja: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        if(number2 == 0){
            throw new ArithmeticException("Neka nasa poruka....");
        }
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
    }

}
