package formula;

public  class VariadicOperator implements Formula {

    private Formula[] formulas;
    private Operator operator ;

    public VariadicOperator(Operator operator, Formula[] formulas) {

        this.formulas = formulas;
        this.operator=operator;
    }
    @Override
    public String asString() {
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < formulas.length; i++) {
            sb.append(formulas[i].asString());
            if (i < formulas.length - 1) {
                sb.append(operator.symbol());
            }
        }
        sb.append(")");
        return sb.toString();
    }
    @Override
    public double asValue() {
        double result = operator.initialValue();
        for (Formula formula : formulas) {
            result = operator.cumulativeValue(result, formula.asValue());
        }
        return result;
    }
}
