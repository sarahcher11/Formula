package formula;

public class Product extends Operation{
    private Formula[] factors;

    public Product(Formula... factors) {
        this.factors = factors;
    }

    @Override
    protected String symbol() {
        return "*";
    }

    @Override
    protected double initialValue() {
        return 1;
    }

    @Override
    protected double cumulativeValue(double accumulator, double value) {
        return accumulator*value;
    }



}
