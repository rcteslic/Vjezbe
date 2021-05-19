package brojanje;

public class Inkrement3 extends BrojacA implements BrojacI {
    @Override
    public int inkrement() {
        if (MAX < vrjednost) {
            System.out.println(ERROR_MSG);
        } else {
            vrjednost += 3;
        }
        return vrjednost;
    }

    @Override
    public int dekrement() {
        vrjednost -= 3;
        return vrjednost;
    }
}
