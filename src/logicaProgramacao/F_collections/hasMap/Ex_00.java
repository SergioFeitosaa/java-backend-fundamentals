package logicaProgramacao.F_collections.hasMap;

import java.util.HashMap;
import java.util.Map;

public class Ex_00 {

    public static void main(String[] args) {

        // Armazenar pares de chave-valor
        HashMap<String, Integer> mapa = new HashMap<>();
        HashMap<String, String> usuarios = new HashMap<>();

        // add elementos
        mapa.put("Java", 1);
        mapa.put("Python", 2);
        mapa.put("C++", 3);

        // Chave = CPF, valor = nome
        usuarios.put("00000000", "Olivaldo");
        usuarios.put("11111111", "Maria do Carmo");
        usuarios.put("22222222", "Pedro");
        usuarios.put("33333333", "Carlos");
        usuarios.put("44444444", "Gabriela");
        usuarios.put("55555555", "Moises");

        // remover os elementos
        System.out.println("O usuario foi removido: " + usuarios.remove("00000000"));

        // acessar
        System.out.println("Acessando: " + mapa.get("Java"));

        //interações - pecorrendo valores
        for (Map.Entry<String, String> entry : usuarios.entrySet()){
            String chave = entry.getKey();
            String valor = entry.getValue();
            System.out.println("Chave: " + chave + " valor: " + valor);
        }

        // Quantidade de elementos coleção
        System.out.println("Quantindade de elementos:" + usuarios.size());

        // Limpando coleções
        usuarios.clear();
        System.out.println("Depois de limpar apagar os elementos da coleção");


    }
}
