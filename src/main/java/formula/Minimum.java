package formula;

public class Minimum implements Formula{
    private Formula[] formulas;

    public Minimum(Formula... formulas) {
        this.formulas = formulas;
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
