package formula;

public class ExtensionFormulaFactory implements AbstractFormulaFactory {
    @Override
    public Formula createConstant(double Value) {
        return new Constant(Value);
    }

    @Override
    public Formula createProduct(Formula... formulas) {
        return new Product(formulas);
    }

    @Override
    public Formula createSum(Formula... formulas) {
        return new Sum(formulas);
    }
}
