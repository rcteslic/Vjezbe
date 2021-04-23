package exeption;

public class MainExeption {
    public static void main(String[] args) {
        Dijeljenje dijeljenje = new Dijeljenje();
        try {
            dijeljenje.podjeli();
            dijeljenje.podjeli();
            dijeljenje.podjeli();
        } catch (ArithmeticException exception) {
            //   System.out.println(exception);
        } finally {

        }
        System.out.println("Nastavak koda....");
    }
}

