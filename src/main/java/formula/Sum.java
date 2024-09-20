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
    protected double initialValue() {
        return  0;
    }

    @Override
    protected double cumulativeValue(double accumulator, double value) {
        return accumulator+value;
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
