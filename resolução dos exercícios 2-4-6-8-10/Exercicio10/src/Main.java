import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base (a): ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor do expoente (b): ");
        int b = scanner.nextInt();

        // Validação: a e b devem ser positivos
        if (a <= 0 || b <= 0) {
            System.out.println("Erro: os valores de a e b devem ser inteiros positivos.");
        } else {
            long resultado = Potencia.potencia(a, b);
            System.out.println(a + "^" + b + " = " + resultado);
        }

        scanner.close();


	}

}
