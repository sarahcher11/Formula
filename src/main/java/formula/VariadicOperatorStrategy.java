package formula;

public class VariadicOperatorStrategy implements Formula{


    private Formula[] formulas;
    private Operator operator;

    public VariadicOperatorStrategy(Formula[] formulas, Operator operator) {
        this.formulas = formulas;
        this.operator = operator;
    }

    @Override
    public double asValue() {
        double value = operator.initialValue();
        for (Formula formula : formulas)
            value = operator.cumulativeValue(formula.asValue(), value);
        return value;
    }



    @Override
    public String asString() {
        String string = "(" + formulas[0].asString();
        for (int index = 1; index < formulas.length; index++)
            string = string + operator.symbol() + formulas[index].asString();
        return string + ")";
    }

}
