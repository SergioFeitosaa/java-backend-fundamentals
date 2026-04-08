package logicaProgramacao.E_arrayList;
import java.util.ArrayList;

public class Ex_05 {
//    Exercício 5 — Verificação
//    Crie uma lista de números
//    Adicione 5 números: Verifique se existe o número 10 na lista
//💡  Dica: contains()
    public static void main(String[] args) {
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(10);
        listaDeNumeros.add(20);
        listaDeNumeros.add(30);
        listaDeNumeros.add(40);
        listaDeNumeros.add(50);

        for (int numero : listaDeNumeros){
            System.out.println("Números: " + numero);
        }

        boolean contem = listaDeNumeros.contains(10);
        System.out.println("Existe o número 10 na lista: " + contem);

    }
}
