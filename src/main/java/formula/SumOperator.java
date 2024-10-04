package formula;

import formula.Operator;

class SumOperator implements Operator {
    @Override
    public String symbol() {
        return "+";
    }

    @Override
    public double initialValue() {
        return 0;
    }

    @Override
    public double cumulativeValue(double accumulator, double value) {
        return accumulator + value;
    }
}