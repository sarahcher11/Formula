package formula;

public class Variable implements Formula {

    private String name;
    private double value;
    public Variable(String variable, double i) {
        this.name =variable;
        this.value=i;
    }

    @Override
    public String asString() {
        return name;
    }

    @Override
    public double asValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void set(double value) {
        this.value = value;
    }
}
