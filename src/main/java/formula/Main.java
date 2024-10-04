package formula;



public class Main {

        public static void main(String[] args) {
            AbstractFormulaFactory factory = new ExtensionFormulaFactory();  // Ou StrategyFormulaFactory()
            Calculator calculator = new Calculator(factory);

            // Analyse de l'expression postfixée "2 5 + 3 *"
            Formula result = calculator.analyze("2", "5", "+", "3", "*");
            System.out.println(result.asValue());  // Devrait afficher 21.0 (car (2+5)*3)
        }
}



