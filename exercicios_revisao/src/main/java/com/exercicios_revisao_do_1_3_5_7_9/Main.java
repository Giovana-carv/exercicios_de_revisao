package com.exercicios_revisao_do_1_3_5_7_9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        // Instanciando os exercicios
        Exercicio1 Exercicio1 = new Exercicio1();
        Exercicio3 Exercicio3 = new Exercicio3();
        Exercicio5 Exercicio5 = new Exercicio5();
        Exercicio7 Exercicio7 = new Exercicio7();
        Exercicio9 Exercicio9 = new Exercicio9();

        int opcao;

        do {

            System.out.println("\n===== LISTA DE EXERCICIOS =====");
            System.out.println("1 - Exercicio 1");
            System.out.println("3 - Exercicio 3");
            System.out.println("5 - Exercicio 5");
            System.out.println("7 - Exercicio 7");
            System.out.println("9 - Exercicio 9");
            System.out.println("0 - Sair");

            System.out.print("\nEscolha um exercicio: ");
            opcao = Integer.parseInt(leia.nextLine());

            switch (opcao) {

                case 1:
                    Exercicio1.executar(leia);
                    break;

                case 3:
                    Exercicio3.executar(leia);
                    break;

                case 5:
                    Exercicio5.executar();
                    break;

                case 7:
                    Exercicio7.executar(leia);
                    break;

                case 9:
                    Exercicio9.executar(leia);
                    break;

                case 0:
                    System.out.println("\nEncerrando programa...");
                    break;

                default:
                    System.out.println("\nOpcao invalida!");
                    break;
            }

        } while (opcao != 0);

        leia.close();
    }
}
