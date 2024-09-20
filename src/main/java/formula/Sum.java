package formula;

public class Sum extends Operation {
    private Formula[] terms;
    public Sum(Formula... terms) {
        this.terms = terms;
    }

    @Override
    protected String symbol() {
        return "+";
    }

    @Override
    public String asString() {
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < terms.length; i++) {
            sb.append(terms[i].asString());
            if (i < terms.length - 1) {
                sb.append("+");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public double asValue() {
        double sum = 0;
        for (Formula term : terms) {
            sum += term.asValue();
        }
        return sum;
    }
}
