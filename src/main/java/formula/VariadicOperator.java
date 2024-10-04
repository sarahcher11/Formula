package formula;

public abstract class VariadicOperator implements Formula {

    private Formula[] formulas;

    public VariadicOperator( Formula[] formulas) {

        this.formulas = formulas;
    }
    @Override
    public String asString() {
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < formulas.length; i++) {
            sb.append(formulas[i].asString());
            if (i < formulas.length - 1) {
                sb.append(symbol());
            }
        }
        sb.append(")");
        return sb.toString();
    }
    @Override
    public double asValue() {
        double result = initialValue();
        for (Formula formula : formulas) {
            result = cumulativeValue(result, formula.asValue());
        }
        return result;
    }

    protected abstract String symbol();
    protected  abstract double initialValue();
    protected  abstract double cumulativeValue(double accumulator , double value );
}
