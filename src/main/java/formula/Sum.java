package formula;

class Sum extends VariadicOperator {
    public Sum(Formula[] formulas) {
        super(formulas);
    }

    @Override
    public String symbol() {
        return "+";
    }

    @Override
    public double initialValue() {
        return 0;
    }

    @Override
    public double cumulativeValue(double accumulator, double value) {
        return accumulator + value;
    }
}