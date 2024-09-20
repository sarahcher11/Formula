package formula;

public class Variable implements Formula {

    private String variable ;
    private double value;
    public Variable(String variable, double i) {
        this.variable=variable;
        this.value=i;
    }
}
