package formula;

public class Main {

    public static void main(String[] args) {
        /*Variable x = new Variable("x", 2.5);
        Variable y = new Variable("y", 4);
        Formula formula =
                new Sum(x, new Product(y, new Sum(x, y)));
        System.out.println(formula.asString()); // "(x+(y*(x+y))"
        System.out.println(formula.asValue()); // "28.5"
        x.set(5);
        System.out.println(formula.asValue());*/

        Variable x = new Variable("x", 2);
        Variable y = new Variable("y", 4);

        Formula absolute = new AbsoluteValue(new Sum(x, new Product(y, new Sum(x, y))));
        System.out.println(absolute.asString());  // "|(x+(y*(x+y)))|"
        System.out.println(absolute.asValue());   // "28.0"

        Formula square = new Square(x);
        System.out.println(square.asString());    // "(x)^2"
        System.out.println(square.asValue());     // "4.0"

        Formula sqrt = new SquareRoot(new Sum(x, y));
        System.out.println(sqrt.asString());      // "√(x+y)"
        System.out.println(sqrt.asValue());       // "2.449..."

        Formula power = new Power(x, 3);
        System.out.println(power.asString());     // "(x)^3"
        System.out.println(power.asValue());      // "8.0"

        Formula min = new Minimum(x, y, new Sum(x, y));
        System.out.println(min.asString());       // "min(x, y, (x+y))"
        System.out.println(min.asValue());        // "2.0"

        Formula max = new Maximum(x, y, new Sum(x, y));
        System.out.println(max.asString());       // "max(x, y, (x+y))"
        System.out.println(max.asValue());        // "6.0"
    }
}
