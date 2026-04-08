package logicaProgramacao.E_arrayList;

import java.util.ArrayList;
public class Ex_03 {
    //    Exercício 3 — Acessando posição específica
//    Crie uma lista de frutas
//    Adicione 4 frutas
//    Mostre: Primeiro elemento, Último elemento
//💡 Dica: último = size() - 1
    public static void main(String[] args) {
        ArrayList<String> listaDeFrutas = new ArrayList<>();
        listaDeFrutas.add("Manga");
        listaDeFrutas.add("Abacaxi");
        listaDeFrutas.add("Laranja");
        listaDeFrutas.add("Banana");

        for (String fruta : listaDeFrutas){
            System.out.println("fruta: " + fruta);
        }

        String primeiraFruta = listaDeFrutas.get(0);
        String ultimaFruta = listaDeFrutas.get(listaDeFrutas.size()-1);
        System.out.println("Primeira fruta: " + primeiraFruta );
        System.out.println("Ultima fruta: " + ultimaFruta);
    }
}
