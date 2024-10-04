package formula;

public class StrategyFormulaFactory implements AbstractFormulaFactory{
    @Override
    public Formula createConstant(double value) {
        return new Constant(value);
    }

    @Override
    public Formula createProduct(Formula... formulas) {
        return null;
    }

    @Override
    public Formula createSum(Formula... formulas) {
        return null;
    }
}
