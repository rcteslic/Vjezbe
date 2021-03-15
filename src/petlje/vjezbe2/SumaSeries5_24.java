package petlje.vjezbe2;

public class SumaSeries5_24 {
    public static void main(String[] args) {


        double suma = 0;
        int djeljenik = 1;
        for (double djelilac = 1; djelilac <= 97; djelilac += 2) {
            djeljenik += 2;
            System.out.println(djelilac + "/" + djeljenik);
            suma += (djelilac / djeljenik);
        }
        System.out.println("suma = " + suma);
    }
}
