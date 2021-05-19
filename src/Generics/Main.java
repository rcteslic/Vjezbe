package Generics;

class Container<T extends Number> {
    private T value;

    public Container(T value) {
        this.value = value;
    }

    public Container() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show() {
        System.out.println("Klasa: " + this.value.getClass().toString());
    }

    public double kvadrat() {
        return value.doubleValue() * value.doubleValue();
    }

    public boolean isAbsEqual(Container<? extends Number> passedNumber) {

        final double abs = Math.abs(this.value.doubleValue());
        final double abs2 = Math.abs(passedNumber.value.doubleValue());
        System.out.println(abs + "==" + abs2);
        return abs == abs2;
    }
}

public class Main {
    public static void main(String[] args) {
        Container<Integer> intCo = new Container(2);
        Container<Integer> intCo2 = new Container(-2);

        boolean x = intCo.isAbsEqual(intCo2);

        System.out.println(x);

    }
}
