import java.util.Random;

public class Main {

    public static Fila criarFilaAleatoria(int quantidade) {
        Random rand = new Random();
        Fila f = new Fila(quantidade);
        for (int i = 0; i < quantidade; i++) {
            f.enfileirar(rand.nextInt(100));
        }
        return f;
    }

    public static Fila inverter(Fila f1) {
        int n = f1.tamanho();

        Pilha pilha = new Pilha(n);   
        Fila f2 = new Fila(n);        

        while (!f1.vazia()) {
            int x = f1.desenfileirar();
            pilha.empilhar(x);
        }

        while (!pilha.vazia()) {
            int x = pilha.desempilhar();
            f2.enfileirar(x);
        }

        return f2;
    }

    public static void main(String[] args) {
    	//teste pequeno , deixei aqui caso precise testar futuramente
        //Fila teste = new Fila(3);
        //teste.enfileirar(1);
        //teste.enfileirar(2);
        //teste.enfileirar(3);

        //Fila invTeste = inverter(teste);
        //System.out.print("Teste pequeno (esperado: 3 2 1): ");
        //while (!invTeste.vazia()) {
         //   System.out.print(invTeste.desenfileirar() + " ");
        
        //System.out.println();

        Fila f1 = criarFilaAleatoria(100);
        Fila copiaF1 = f1.copiar();
        Fila f2 = inverter(f1);
        Fila copiaF2 = f2.copiar();
        
        System.out.print("F1: ");
        while (!copiaF1.vazia()) {
            System.out.print(copiaF1.desenfileirar() + " ");
        }
        System.out.println();
        
        System.out.print("F2: ");
        while (!copiaF2.vazia()) {
            System.out.print(copiaF2.desenfileirar() + " ");
        }

        
    }
}