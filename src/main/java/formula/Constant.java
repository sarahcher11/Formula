package formula;

public class Constant implements Formula{

    int value;

    public Constant(int value) {
        this.value = value;
    }

    @Override
    public String asString() {
        return String.valueOf(value);
    }

    @Override
    public double asValue() {
        return value;
    }
}
