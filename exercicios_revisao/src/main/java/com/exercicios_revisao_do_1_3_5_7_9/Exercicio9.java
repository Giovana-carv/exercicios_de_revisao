package com.exercicios_revisao_do_1_3_5_7_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio9 {

    public void executar(Scanner leia) {

        List<Integer> lista = new ArrayList<>();

        System.out.println("\n===== EXERCICIO 9 =====");

        System.out.print("Quantos numeros deseja inserir na lista? ");
        int quantidade = Integer.parseInt(leia.nextLine());

        // Recebe os numeros e adiciona na lista
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            int numero = Integer.parseInt(leia.nextLine());

            lista.add(numero);
        }

        int resultado = somar(lista, 0);

        System.out.println("\nLista: " + lista);
        System.out.println("Soma dos elementos: " + resultado);
    }

    public int somar(List<Integer> lista, int indice) {

        // Caso base: todos os elementos foram percorridos
        if (indice == lista.size()) {
            return 0;
        }

        // Soma o elemento atual com o resultado da proxima chamada
        return lista.get(indice) + somar(lista, indice + 1);
    }
}