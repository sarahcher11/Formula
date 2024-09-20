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
    public double asValue() {
        double product = 1;
        for (Formula factor : factors) {
            product *= factor.asValue();
        }
        return product;
    }
}
