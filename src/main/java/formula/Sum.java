package formula;

public class Sum implements Formula {
    public Sum(Formula left, Formula right) {
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
