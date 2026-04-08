package logicaProgramacao.E_arrayList;

import java.util.ArrayList;

public class Ex_09_1 {
    // Exercício 9.1 — Filtrar números pares
//     Objetivo: Criar uma lista de números, Criar uma segunda lista
//    Adicionar na segunda lista apenas números pares e a sua soma
    public static void main(String[] args) {
        ArrayList<Integer> listaDenumeros = new ArrayList<>();
        listaDenumeros.add(10);
        listaDenumeros.add(6);
        listaDenumeros.add(3);
        listaDenumeros.add(2);
        listaDenumeros.add(32);

        int soma = 0;

        System.out.println("Lista de números completos");
        for (int numero : listaDenumeros) {
            System.out.println(numero);
        }

        ArrayList<Integer> listaDeNumerosPares = new ArrayList<>();
        for (int numero : listaDenumeros) {
            if (numero % 2 == 0) {
                soma += numero;
                listaDeNumerosPares.add(numero);
            }
        }

        System.out.println("Lista filtrada com números pares");
        for (int numero : listaDeNumerosPares) {
            System.out.println(numero);
        }
        System.out.println("Soma dos números Pares: " + soma);
        System.out.println("Quantidade de números pares: " + listaDeNumerosPares.size());
    }
}
