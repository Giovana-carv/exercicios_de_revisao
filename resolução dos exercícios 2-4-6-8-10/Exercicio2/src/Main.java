import java.util.Stack;

import java.util.Stack;

public class Main {

    // Método copiado do seu código
    public static void removerChave(Stack<Integer> pilha, int c) {
        Stack<Integer> auxiliar = new Stack<>();
        boolean achou = false;

        while (!pilha.isEmpty()) {
            int item = pilha.pop();
            if (item == c && !achou) {
                achou = true;
            } else {
                auxiliar.push(item);
            }
        }

        while (!auxiliar.isEmpty()) {
            pilha.push(auxiliar.pop());
        }
    }

    // Programa principal
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        pilha.push(3);
        pilha.push(5);
        pilha.push(2);
        pilha.push(1);
        pilha.push(4);
        pilha.push(2);

        System.out.println("Antes:  " + pilha);
        removerChave(pilha, 5);
        System.out.println("Depois: " + pilha);
    }
}
