package formula;

public abstract class VariadicOperator implements Formula{

    protected Formula[] formulas;

    public VariadicOperator(Formula[] formulas) {
        this.formulas = formulas;
    }
}
