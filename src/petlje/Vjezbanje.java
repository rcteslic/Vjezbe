package petlje;

public class Vjezbanje {
    public static void main(String[] args) {
        for (int broj = 0; broj <= 10000; broj++) {
            System.out.println(broj);
            for (int i = 0; i <= 10000; i++) {
                System.out.println(broj);
            }
        }
        System.out.println("Kraj predavanja");
    }
}
