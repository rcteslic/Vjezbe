package petlje.vjezbe1;

public class Pounds {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 2);
            System.out.println("i = " + random);
        }


        int pounds = 15;
        System.out.println("KM        Pounds        |        Pounds        KM");
        int i = 1;
        for (; i < 200; ) {
            i += 2;
            pounds += 5;
            double funta = i * 2.2;
            System.out.println(i + "         " + (funta / 2.2) + "        |        " + pounds + "        " + (pounds / 2.2) + "KM");
        }
    }
}
