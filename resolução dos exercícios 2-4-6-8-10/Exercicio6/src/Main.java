import java.util.Random;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numeros = new int[2000];
        for (int i = 0; i < 1000; i++) {
            numeros[i] = 1 + rand.nextInt(1000);
        }
        for (int i = 0; i < 1000; i++) {
            numeros[1000 + i] = -1 - rand.nextInt(1000);
        }

        for (int i = numeros.length - 1; i >= 0; i--) {
            int j = rand.nextInt(i + 1);
            int t = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = t;
        }

        Queue<Integer> fila = new LinkedList<>();
        for (int n : numeros) {
            fila.add(n);
        }

        Stack<Integer> pilha = new Stack<>();
        
        while (!fila.isEmpty()) { 
            int primeiro = fila.peek(); 
            
            if (primeiro > 0) {
                fila.poll();
                pilha.push(primeiro);
            } else {
                fila.poll();
                if (!pilha.isEmpty()) {
                    System.out.println(pilha.pop());
                }
            }
        }
       
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop() + " ");
        }
    }
}