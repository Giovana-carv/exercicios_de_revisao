package com.exercicios_revisao_do_1_3_5_7_9;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio1 {

    public void executar(Scanner entrada) {

        Stack<Character> pilha = new Stack<>();

        System.out.println("\n===== EXERCICIO 1 =====");

        System.out.print("Digite um texto: ");
        String texto = entrada.nextLine();

        // Empilhar os caracteres
        for (int i = 0; i < texto.length(); i++) {
            pilha.push(texto.charAt(i));
        }

        // Imprimir o texto invertido
        StringBuilder invertido = new StringBuilder();

        while (!pilha.isEmpty()) {
            invertido.append(pilha.pop());
        }

        System.out.println("Texto invertido: " + invertido);

        // Preparar o texto para verificar o palindromo
        String original = texto.toLowerCase()
                .replace(" ", "")
                .replace(".", "");

        String reverso = invertido.toString()
                .toLowerCase()
                .replace(" ", "")
                .replace(".", "");

        // Verificar palindromo
        if (original.equals(reverso)) {
            System.out.println("O texto e um palindromo.");
        } else {
            System.out.println("O texto nao e um palindromo.");
        }
    }
}
