package formula;

public class Product implements Formula{
    private Formula[] factors;

    public Product(Formula... factors) {
        this.factors = factors;
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
        return 0;
    }
}
