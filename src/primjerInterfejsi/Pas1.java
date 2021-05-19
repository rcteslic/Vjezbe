package primjerInterfejsi;

public class Pas1 implements ZivotinjeSaNogama {
    @Override
    public void jede() {
        System.out.println("Jede kosti...");
    }

    @Override
    public void krece() {
        System.out.println("Trci");
    }

    @Override
    public void pol() {
        System.out.println("Jednopolan");
    }

    @Override
    public void trcanje() {
        System.out.println("True");
    }
}
