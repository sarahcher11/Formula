package formula;

public abstract class VariadicOperator implements Formula {

    protected Formula[] formulas;

    public VariadicOperator(Formula[] formulas) {
        this.formulas = formulas;
    }
    // Méthode abstraite pour définir le symbole (à implémenter dans les sous-classes)
    protected abstract String symbol();
    // Méthode abstraite pour initialiser la valeur de départ (ex: 0 pour Sum, 1 pour Product)
    protected abstract double initialValue();
    // Méthode abstraite pour définir la manière de combiner les valeurs (addition pour Sum, multiplication pour Product)
    protected abstract double cumulativeValue(double a, double b);
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
}
