package logicaProgramacao.E_arrayList;

import java.util.ArrayList;

public class Ex_07 {
//    Exercício 7 — Maior número da lista
//    Quero ver você: Percorrer a lista
//    Descobrir o maior valor
    public static void main(String[] args) {
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(10);
        listaDeNumeros.add(60);
        listaDeNumeros.add(100);
        listaDeNumeros.add(200);

        int maiorNumero = listaDeNumeros.get(0);

        for (int numero : listaDeNumeros){
            System.out.println("Números: " + numero);
            if (numero > maiorNumero){
                maiorNumero = numero;
            }
        }
        System.out.println("Maior número: " + maiorNumero);
    }
}
