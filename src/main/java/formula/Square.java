package formula;

public class Square implements Formula {

    private Formula formula;
    public Square(Formula formula) {
        this.formula=formula;
    }

    @Override
    public String asString() {
        return "";
    }

    @Override
    public double asValue() {
        return 0;
    }
}
