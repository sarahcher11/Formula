package formula;

public class AbsoluteValue implements Formula {

    private Formula formula;

    public AbsoluteValue(Formula formula) {
        this.formula = formula;
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
