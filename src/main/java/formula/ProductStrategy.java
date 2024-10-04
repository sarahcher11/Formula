package formula;

public class ProductStrategy implements Operator {
    public String symbol() {
        return "+";
    }

    @Override
    public double initialValue() {
        return 0; // La somme commence à 0
    }

    @Override
    public double cumulativeValue(double accumulator, double value) {
        return accumulator + value; // Addition des valeurs

    }
}
