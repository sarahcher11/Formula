package formula;

public class Product extends VariadicOperator{

    public Product(Formula... factors) {
        super(factors);

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
