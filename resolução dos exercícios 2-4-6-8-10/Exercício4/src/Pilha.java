
public class Pilha {
	
    private int[] vetor;
    private int topo;

    public Pilha(int capacidade) {
        vetor = new int[capacidade];
        topo = 0;
    }

    public void empilhar(int x) {
        vetor[topo] = x;
        topo++;
    }

    public int desempilhar() {
        topo--;
        return vetor[topo];
    }

    public boolean vazia() {
        return topo == 0;
    }

    public int tamanho() {
        return topo;
    }
}
