package logicaProgramacao.E_arrayList.basico;

import java.util.ArrayList;

public class Ex_09 {
    //    Exercício 9 — Filtrar números
//    Você vai: Criar uma lista com vários números, Criar uma segunda lista
//    Adicionar na segunda lista apenas números maiores que 10
    public static void main(String[] args) {
        ArrayList<Integer> listaOriginal = new ArrayList<>();
        listaOriginal.add(5);
        listaOriginal.add(12);
        listaOriginal.add(8);
        listaOriginal.add(20);
        listaOriginal.add(3);
        listaOriginal.add(15);

        System.out.println("Lista original:");
        for (int numero : listaOriginal) {
            System.out.println(numero);
        }

        ArrayList<Integer> listaFiltrada = new ArrayList<>();

        for (int numero : listaOriginal) {
            if (numero > 10) {
                listaFiltrada.add(numero);
            }
        }

        System.out.println("Lista filtrada (maiores que 10):");
        for (int numero : listaFiltrada) {
            System.out.println(numero);
        }
        System.out.println("Quantidade filtrada: " + listaFiltrada.size());
    }
}
