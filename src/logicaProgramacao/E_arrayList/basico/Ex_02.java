package logicaProgramacao.E_arrayList.basico;

import java.util.ArrayList;

public class Ex_02 {
//    Crie uma lista de números (Integer)
//    Adicione 5 números
//    Mostre:
//    Todos os números
//    O tamanho da lista (size())
    public static void main(String[] args) {
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(10);
        listaDeNumeros.add(20);
        listaDeNumeros.add(30);
        listaDeNumeros.add(40);
        listaDeNumeros.add(50);

        for (Integer numero : listaDeNumeros){
            System.out.println("Números: " + numero);
        }

       int tamanho = listaDeNumeros.size();
        System.out.println("Tamanho da lista: " + tamanho);
    }
}
