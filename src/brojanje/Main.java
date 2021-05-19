package brojanje;

public class Main {
    public static void main(String[] args) {
        Inkrement2 inkrement2 = new Inkrement2();
        for (int i =0; i< 5; i++){
            System.out.println(inkrement2.inkrement());
        }
        System.out.println("inc 2--->"+inkrement2.getVrjednost());

        Inkrement3 inkrement3= new Inkrement3();
        for (int i =0; i< 5; i++){
            System.out.println(inkrement3.inkrement());
        }
        System.out.println("inc 3--->"+ inkrement3.getVrjednost());
        inkrement2.dekrement();
    }

}
