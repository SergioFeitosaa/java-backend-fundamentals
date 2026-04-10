package logicaProgramacao.E_arrayList.basico;
import java.util.ArrayList;

public class Ex_04 {
//    Exercício 4 — Remoção
//    Crie uma lista de nomes: Adicione 5 nomes
//    Remova o terceiro nome
//    Mostre a lista atualizada
    public static void main(String[] args) {
        ArrayList<String> listaDeNome = new ArrayList<>();
        listaDeNome.add("Sérgio");
        listaDeNome.add("Fernanda");
        listaDeNome.add("Mariana");
        listaDeNome.add("Severina");
        listaDeNome.add("Fernando");

        for (String nome : listaDeNome) {
            System.out.println("ANTES: " + nome);
        }

        listaDeNome.remove(2);

        for (String nome2 : listaDeNome){
            System.out.println("DEPOIS " + nome2);
        }

    }
}
