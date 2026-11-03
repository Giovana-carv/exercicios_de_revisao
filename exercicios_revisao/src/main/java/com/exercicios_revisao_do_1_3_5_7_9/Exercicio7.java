package com.exercicios_revisao_do_1_3_5_7_9;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;

public class Exercicio7 {

    public void executar(Scanner entrada) {

        Queue<Integer> fila = new LinkedList<>();

        System.out.println("\n===== EXERCICIO 7 =====");

        // Recebe os 20 numeros e insere na fila
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            int numero = Integer.parseInt(entrada.nextLine());

            fila.add(numero);
        }

        System.out.println("\nFila original:");
        System.out.println(fila);

        inverterFila(fila);

        System.out.println("\nFila invertida:");
        System.out.println(fila);
    }

    public void inverterFila(Queue<Integer> fila) {

        Stack<Integer> pilha = new Stack<>();

        // Retira os elementos da fila e empilha
        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }

        // Desempilha os elementos e insere novamente na fila
        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }
    }
}