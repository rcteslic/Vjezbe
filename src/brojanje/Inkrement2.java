package brojanje;

public class Inkrement2 extends BrojacA implements BrojacI {
    @Override
    public int inkrement() {
        vrjednost += 2;
        return vrjednost;
    }

    @Override
    public int dekrement() {
        vrjednost -= 2;
        return vrjednost;
    }
}
