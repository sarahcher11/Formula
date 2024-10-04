package formula;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Calculator {


    private FormulaFactory factory;

    public Calculator(FormulaFactory factory) {
        this.factory = factory;
    }



    private void analyzeSum(Deque<Formula> deque) {
        Formula right = deque.pollLast();  // Dépile le dernier élément (opérande droite)
        Formula left = deque.pollLast();   // Dépile l'avant-dernier élément (opérande gauche)
        Formula sum = factory.createSum(left, right);  // Utilise la fabrique pour créer la somme
        deque.addLast(sum);  // Ajoute la formule résultante à la fin de la deque (simule un push)
    }

    private void analyzeProduct(Deque<Formula> deque) {
        Formula right = deque.pollLast();  // Dépile le dernier élément (opérande droite)
        Formula left = deque.pollLast();   // Dépile l'avant-dernier élément (opérande gauche)
        Formula product = factory.createProduct(left, right);  // Utilise la fabrique pour créer le produit
        deque.addLast(product);  // Ajoute la formule résultante à la fin de la deque
    }
}
