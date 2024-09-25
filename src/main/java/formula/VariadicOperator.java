package formula;

public abstract class VariadicOperator implements Formula{

    protected Formula[] formulas;

    public VariadicOperator(Formula[] formulas) {
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
}
