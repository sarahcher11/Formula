package formula;

public class Maximum implements Formula{
    private Formula[] formulas;

    public Maximum(Formula... formulas) {
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
