package petlje.vjezbe2;

public class FindTheSmallestN_5_12 {
    public static void main(String[] args) {
        /*
         *      (Find the smallest n such that n^2 > 12,000)
         *      Use a while loop to find the smallest
         *      integer n such that n^2 is greater than 12,000.
         * */


























        double numberPow = 0;
        int n = 0;
        while (numberPow < 12000) {
            n++;
            numberPow = n*n;
        }
        System.out.println(n);

    }

}
