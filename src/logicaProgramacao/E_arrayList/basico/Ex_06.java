package logicaProgramacao.E_arrayList.basico;

import java.util.ArrayList;

public class Ex_06 {
    //    Exercício 6 — Soma dos valores
    //    Criar lista de números: Percorrer, Somar todos e Mostrar resultado.
    public static void main(String[] args) {
        ArrayList<Integer> listaDenumeros = new ArrayList<>();
        listaDenumeros.add(10);
        listaDenumeros.add(20);
        listaDenumeros.add(30);

        int soma = 0;

        for (int numero : listaDenumeros) {
            System.out.println("Números: " + numero);
            soma += numero;
        }
        System.out.println("Soma total: " + soma);
    }
}
