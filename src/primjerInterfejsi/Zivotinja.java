package primjerInterfejsi;

public interface Zivotinja {
    String PORUKA = "Poruka iz interfejsa Zivotinja";

    void jede();

    void krece();

    void pol();

    default void poruka(){
        System.out.println("Poruka...iz defaultne metode");
    }
}
