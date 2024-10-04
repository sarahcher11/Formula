package formula;

public class Product extends VariadicOperator{


    public Product(Formula[] formulas) {
        super(formulas);
    }

    @Override
    public String symbol() {
        return "*";
    }

    @Override
    public double initialValue() {
        return 1;
    }

    @Override
    public double cumulativeValue(double accumulator, double value) {
        return accumulator*value;
    }



}
