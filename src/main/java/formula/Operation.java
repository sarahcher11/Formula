package formula;

public abstract class  Operation implements Formula {
    protected Formula[] formulas;

    public Operation(Formula... formulas) {
        this.formulas = formulas;
    }
    protected abstract String symbol();


}
