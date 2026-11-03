
public class Fila {

	    private int[] vetor;
	    private int inicio;
	    private int fim;
	    
	    public Fila(int capacidade) {
	        vetor = new int[capacidade];
	        inicio = 0;
	        fim = 0;
	    }

	    public void enfileirar(int x) {
	        vetor[fim] = x;
	        fim++;
	    }

	    public int desenfileirar() {
	        int x = vetor[inicio];
	        inicio++;
	        return x;
	    }

	    public boolean vazia() {
	        return inicio == fim;
	    }

	    public int tamanho() {
	        return fim - inicio;
	    }
	    public Fila copiar() {
	        Fila copia = new Fila(fim - inicio);   
	        for (int i = inicio; i < fim; i++) {
	            copia.enfileirar(vetor[i]);
	        }
	        return copia;
	    }
}
