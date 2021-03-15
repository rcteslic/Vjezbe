package metode;

public class Bla {
    public static void main(String[] args) {
        int reverse = 0;
        int uneseni = 6543;

        int pomocnaCifra = uneseni % 10; //3
        reverse = pomocnaCifra * 10;  //30
        int prva = uneseni / 10 % 10; // 6543/10 = 654     //     654 %10 = 4
        reverse += prva;  // 30 +4
        int druga = uneseni / 100 % 10;
        int treca = reverse * 10 + druga;
        int cetvrta = uneseni / 1000;
        reverse = treca * 10 + cetvrta;
        System.out.println(reverse);


    }
}
