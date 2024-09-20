package formula;

public class Main {

    public static void main(String[] args) {
        Variable x = new Variable("x", 2.5);
        Variable y = new Variable("y", 4);
        Formula formula =
                new Sum(x, new Product(y, new Sum(x, y)));
        System.out.println(formula.asString()); // "(x+(y*(x+y))"
        System.out.println(formula.asValue()); // "28.5"
        x.set(5);
        System.out.println(formula.asValue()); // "41.0"
    }
}
