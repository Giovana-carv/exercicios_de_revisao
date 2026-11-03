package com.exercicios_revisao_do_1_3_5_7_9;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Random;

public class Exercicio5 {

    public void executar() {

        Queue<Integer> fila = new LinkedList<>();

        Stack<Integer> pilha = new Stack<>();

        Random random = new Random();

        System.out.println("\n===== EXERCICIO 5 =====");

        // Realizar 1000 sorteios
        for (int i = 0; i < 1000; i++) {

            int numero = random.nextInt(1000) + 1;

            // Verificar se o numero ja existe na fila
            if (fila.contains(numero)) {

                pilha.push(numero);

            } else {

                fila.add(numero);

            }
        }

        // Imprimir os resultados
        System.out.println("\nFila F:");
        System.out.println(fila);

        System.out.println("\nPilha P:");
        System.out.println(pilha);

        System.out.println("\nQuantidade de numeros distintos: "
                + fila.size());

        System.out.println("Quantidade de numeros repetidos: "
                + pilha.size());
    }
}
