package metode.vjezbe;

import MyUtil.PomocnaKlasa;

import java.util.Random;

public class SortirajNiz {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");
        // Thread.sleep(5000);
        System.out.println("Start now");
        Random random = new Random();
        int[] niz = new int[10000];
        for (int i = 0; i < niz.length; i++) {
            niz[i] = random.nextInt(10000);
        }
        sortiraj(niz);
        //  Arrays.sort(niz);
        PomocnaKlasa.ispis(niz);
    }

    public static int[] sortiraj(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            for (int j = i; j < niz.length; j++) {
                if (niz[i] > niz[j]) {
                    int tmp = niz[i];
                    niz[i] = niz[j];
                    niz[j] = tmp;
                }
            }
        }
        return niz;
    }

}
