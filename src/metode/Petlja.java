package metode;

public class Petlja {
    public static void main(String[] args) {
        Vrjednost.max(2,2);
        char pocetak = 'a';
        char kraj = 'ž';
        int brojac = 0;
        int poLiniji = 10;
        for (char i = pocetak; i <= kraj; i++) {
            brojac++;
            System.out.print(i);
            if (brojac == poLiniji) {
                System.out.println();
                brojac = 0;
            }
        }
    }
}
