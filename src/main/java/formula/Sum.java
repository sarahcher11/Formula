package formula;

public class Sum extends VariadicOperator  {
    public Sum(Formula... terms) {
        super(terms);

    }

    @Override
    protected String symbol() {
        return "+";
    }

    @Override
    protected double initialValue() {
        return  0;
    }

    @Override
    protected double cumulativeValue(double accumulator, double value) {
        return accumulator+value;
    }


}
