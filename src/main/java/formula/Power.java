package formula;

public class Power implements Formula {
    private Formula formula;
    private double exponent;
    public Power(Formula formula, double exponent) {
        this.formula = formula;
        this.exponent = exponent;
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
