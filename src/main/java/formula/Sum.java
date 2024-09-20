package formula;

public class Sum implements Formula {
    private Formula[] terms;
    public Sum(Formula... terms) {
        this.terms = terms;
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
