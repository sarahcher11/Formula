package formula;

import java.text.Normalizer;

public interface AbstractFormulaFactory {
    public Formula createConstant(double Value);
    public Formula createProduct(Formula... formulas);
    public Formula createSum(Formula... formulas);
}
