package metode;

public class Vrjednost {
     static int max(int prvi, int drugi) {
        System.out.println("pozvao sa int");
        if (prvi > drugi) {
            return prvi;
        }
        return drugi;
    }
    static int max(int prvi, int drugi, int treci) {
      int veciIzmedjuPrvaDva = Math.max(prvi,drugi); //
        int max = max(veciIzmedjuPrvaDva, treci);
        return max;
    }

    public static int max(double prvi, int drugi) {
        System.out.println("pozvao sa double-int");
        if (prvi > drugi) {
            return (int) prvi;
        }
        return drugi;
    }    public static int max(int prvi, double drugi) {
        System.out.println("pozvao int- double");
        if (prvi > drugi) {
            return (int) prvi;
        }
        return (int)drugi;
    }

    public static void main(String[] args) {
        int broj = max(3,1);
    }
}
