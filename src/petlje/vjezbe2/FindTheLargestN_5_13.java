package petlje.vjezbe2;

public class FindTheLargestN_5_13 {
    /*
 (Find the largest n such that n^3 < 12,000)
  Use a while loop to find the largest integer n such that n^3 is less than 12,000

 */


    public static void main(String[] args) {
        int broj = 0;


        while (Math.pow(broj+1, 3) < 12000) {
            broj++;
        }
        System.out.println(broj);
    }
}
