package formula;

public class Constant implements Formula{

    int value;

    public Constant(int value) {
        this.value = value;
    }

    @Override
    public String asString() {
        return "";
    }

    @Override
    public double asValue() {
        return 0;
    }
}
