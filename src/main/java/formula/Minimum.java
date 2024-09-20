package formula;

public class Minimum implements Formula{
    private Formula[] formulas;

    public Minimum(Formula... formulas) {
        this.formulas = formulas;
    }
    @Override
    public String asString() {
        StringBuilder sb = new StringBuilder("min(");
        for (int i = 0; i < formulas.length; i++) {
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
        double min = formulas[0].asValue();
        for (Formula formula : formulas) {
            min = Math.min(min, formula.asValue());
        }
        return min;
    }
}
