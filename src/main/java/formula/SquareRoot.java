package formula;

public class SquareRoot implements Formula{
    private String formula;
    public SquareRoot(String formula) {
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
