import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TestaPilha teste = new TestaPilha();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int numero = random.nextInt(201) - 100; // -100 a 100
            teste.processar(numero); 
        }
       
        System.out.println("\n--- Estado final ---");
        System.out.println("Tamanho da pilha P (positivos): " + teste.tamanhoP());
        System.out.println("Tamanho da pilha N (negativos): " + teste.tamanhoN());
    }
}