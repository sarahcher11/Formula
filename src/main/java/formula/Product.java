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
    public String asString() {
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < factors.length; i++) {
            sb.append(factors[i].asString());
            if (i < factors.length - 1) {
                sb.append("*");
            }
        }
        sb.append(")");
        return sb.toString();
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
