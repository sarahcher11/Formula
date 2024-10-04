package formula;

public class FormulaFactory {

    public Formula createConstant(double value)
    {
        return new Constant(value);
    }

    public Formula createProduct(Formula... formulas)
    {
        return  new Product(formulas);
    }
}
