package formula;

public abstract class  Operation implements Formula {
    protected Formula[] formulas;

    public Operation(Formula... formulas) {
        this.formulas = formulas;
    }
    protected abstract String symbol();

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

      protected abstract double initialValue();
      protected abstract double cumulativeValue(double accumulator, double value);
}
