package nizovi;

public class SortArray {
    public static void main(String[] args) {
        Integer[] niz = {13, 7, 6, 45, 21, 9, 101, 102};
        for (int i = 0; i < niz.length; i++) {
            //  naci  najmanji  broj  u   nizu
            int trenutniNajmanji = niz[i];
            int trenutniNajmanjiIndeks = i;

            for (int j = i + 1; j < niz.length; j++) {
                if (trenutniNajmanji > niz[j]) {
                    trenutniNajmanji = niz[j];
                    trenutniNajmanjiIndeks = j;
                }
            }
            //  zamijeni  niz[i]  sa  niz[trenutniNajmanjiIndeks]  ukoliko  je potrebno
            if (trenutniNajmanjiIndeks != i) {
                niz[trenutniNajmanjiIndeks] = niz[i];
                niz[i] = trenutniNajmanji;
            }
        }
        ispis(niz);
    }

    private static void ispis(Integer[] niz) {
        for (int i : niz) {
            System.out.print(i + " ");
        }
    }
}
