package com.exercicios_revisao_do_1_3_5_7_9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio3 {

    // Classe para representar um aviao
    class Aviao {
        String nome;
        int identificador;

        Aviao(String nome, int identificador) {
            this.nome = nome;
            this.identificador = identificador;
        }

        public String toString() {
            return "Nome: " + nome +
                    " | Identificador: " + identificador;
        }
    }

    public void executar(Scanner entrada) {
        Queue<Aviao> fila = new LinkedList<>();
        int opcao;
        System.out.println("\n===== EXERCICIO 3 =====");
        do {
            System.out.println("\n--- CONTROLE DE DECOLAGEM ---");
            System.out.println("1 - Listar quantidade de avioes");
            System.out.println("2 - Autorizar decolagem");
            System.out.println("3 - Adicionar aviao");
            System.out.println("4 - Listar todos os avioes");
            System.out.println("5 - Mostrar primeiro aviao");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("\nEscolha uma opcao: ");
            opcao = Integer.parseInt(entrada.nextLine());
            switch (opcao) {
                case 1:
                    System.out.println(
                            "Avioes aguardando: " + fila.size());
                    break;
                case 2:
                    if (!fila.isEmpty()) {
                        Aviao aviao = fila.poll();
                        System.out.println(
                                "Decolagem autorizada: " + aviao.nome);
                    } else {
                        System.out.println("A fila esta vazia.");
                    }
                    break;
                case 3:
                    System.out.print("Nome do aviao: ");
                    String nome = entrada.nextLine();
                    System.out.print("Identificador: ");
                    int id = Integer.parseInt(entrada.nextLine());
                    fila.add(new Aviao(nome, id));
                    System.out.println("Aviao adicionado.");
                    break;
                case 4:
                    if (!fila.isEmpty()) {
                        System.out.println("\nAvioes na fila:");
                        for (Aviao aviao : fila) {
                            System.out.println(aviao);
                        }
                    } else {
                        System.out.println("A fila esta vazia.");
                    }
                    break;
                case 5:
                    if (!fila.isEmpty()) {
                        System.out.println(
                                "Primeiro aviao: " + fila.peek());
                    } else {
                        System.out.println("A fila esta vazia.");
                    }
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);
    }
}
