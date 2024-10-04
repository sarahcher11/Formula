package formula;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Calculator {

    /*// Map associant chaque symbole d'opérateur à une instance de la stratégie correspondante
    private Map<String, Operator> operatorMap;

    public Calculator() {
        operatorMap = new HashMap<>();

        // Initialisation de la map avec les opérateurs disponibles
        operatorMap.put("+", new Sum());
        operatorMap.put("*", new Product());
        // Ajouter d'autres opérateurs ici si nécessaire
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Veuillez entrer une expression en notation postfixée.");
            return;
        }

        // Initialisation du Calculator
        Calculator calculator = new Calculator();

        // Calcul de l'expression postfixée
        double result = calculator.evaluatePostfix(args);
        System.out.println(result);
    }

    public double evaluatePostfix(String[] tokens) {
        Deque<Formula> deque = new ArrayDeque<>();

        for (String token : tokens) {
            if (operatorMap.containsKey(token)) {
                // Si le token est un opérateur, appliquer l'opération correspondante
                Operator operator = operatorMap.get(token);
                Formula right = deque.pollLast();
                Formula left = deque.pollLast();
                deque.addLast(new VariadicOperator(operator, new Formula[]{left, right}));
            } else {
                // Si c'est un nombre, on le convertit en constante
                deque.addLast(new Constant(Double.parseDouble(token)));
            }
        }

        // Le résultat est l'élément restant dans la deque
        return deque.pollLast().asValue();
    }*/
}
