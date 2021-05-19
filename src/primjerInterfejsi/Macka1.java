package primjerInterfejsi;

public class Macka1 implements ZivotinjeSaNogama {
    @Override
    public void jede() {
        System.out.println("Macka pije mljeko....");
    }

    @Override
    public void krece() {
        System.out.println("Voli da skace po drvecu...");
    }

    @Override
    public void pol() {
        System.out.println("Jednpolona.");
    }

    @Override
    public void trcanje() {
        System.out.println("true");
    }

    @Override
    public void poruka(){
        System.out.println("Overajdana poruka");
    }
}
