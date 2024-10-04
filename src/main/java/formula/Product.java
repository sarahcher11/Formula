package formula;

public class Product implements Operator{



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
