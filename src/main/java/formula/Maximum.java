package formula;

public class Maximum implements Formula{
    private Formula[] formulas;

    public Maximum(Formula... formulas) {
        this.formulas = formulas;
    }
    @Override
    public String asString() {
        StringBuilder sb = new StringBuilder("max(");
        for (int i = 0; i < formulas.length; i++){
            sb.append(formulas[i].asString());
            if (i < formulas.length - 1) {
                sb.append(", ");
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
