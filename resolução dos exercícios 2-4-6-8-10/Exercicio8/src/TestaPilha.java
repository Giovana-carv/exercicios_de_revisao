import java.util.Stack;

public class TestaPilha {

    private Stack<Integer> N;
    private Stack<Integer> P;

    public TestaPilha() {
        this.N = new Stack<>();
        this.P = new Stack<>();
    }

        public void processar(int numero) {
        if (numero > 0) {
            P.push(numero);
        } else if (numero < 0) {
            N.push(numero);
        } else {
            retirarEImprimir();
        }
    }

    private void retirarEImprimir() {
        System.out.println("Zero sorteado! Retirando um elemento de cada pilha:");

        Integer elemP = P.isEmpty() ? null : P.pop();
        Integer elemN = N.isEmpty() ? null : N.pop();

        System.out.println("  Pilha P (positivos): " +
                (elemP == null ? "vazia" : elemP));
        System.out.println("  Pilha N (negativos): " +
                (elemN == null ? "vazia" : elemN));
    }

    public int tamanhoP() { return P.size(); }
    public int tamanhoN() { return N.size(); }
}