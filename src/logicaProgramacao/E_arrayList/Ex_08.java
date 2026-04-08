package logicaProgramacao.E_arrayList;

import java.util.ArrayList;

public class Ex_08 {
    //    Exercício 8 — Contar números pares
//    Objetivo: Percorrer a lista, Verificar quais são pares e Contar quantos existem
    public static void main(String[] args) {
        ArrayList<Integer> listaDenumeros = new ArrayList<>();
        listaDenumeros.add(1);
        listaDenumeros.add(2);
        listaDenumeros.add(3);
        listaDenumeros.add(4);
        listaDenumeros.add(8);

        int contadorNumerosPares = 0;

        for (int numero : listaDenumeros) {
            System.out.println("Número: " + numero);

            if (numero % 2 == 0) {
                contadorNumerosPares++;
                System.out.println("Número par: " + numero);
            }
        }
        System.out.println("Quantidade de números pares: " + contadorNumerosPares);

    }
}
