package formula;

import java.text.Normalizer;

public class FormulaFactory {

    public Formula createConstant(double value)
    {
        return new Constant(value);
    }

    public Formula createProduct(Formula... formulas)
    {
        return  new Product(formulas);
    }

    public Formula createSum(Formula... formulas)
    {
        return  new Sum(formulas);
    }
}
