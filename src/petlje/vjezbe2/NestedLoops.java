package petlje.vjezbe2;

public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            System.out.print("Pocetak  " + i); // 0,1
            for (int j = 0; j < 10; j++) {

                System.out.println("vanjska petlja i= " + i); //0 , 0.....
                System.out.println("unutrasnja petlja j = " + j); // 0 ,1,2,3
            }
        }
    }
}
