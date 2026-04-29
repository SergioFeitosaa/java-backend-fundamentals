package logicaProgramacao.F_collections.hasMap;

import java.util.HashMap;
import java.util.Map;

public class Ex_01 {
    public static void main(String[] args) {

        //Formas de interações
        HashMap<String, Double> notasAlunos = new HashMap<>();
        notasAlunos.put("Alice", 9.5);
        notasAlunos.put("Mateus", 8.0);
        notasAlunos.put("Maria", 9.9);

        for (String nome : notasAlunos.keySet()){
            double nota = notasAlunos.get(nome);
            System.out.println(nome + " : " + nota);
        }

        System.out.println("=======================");

        for (Map.Entry<String, Double> nota : notasAlunos.entrySet()){
            String nome = nota.getKey();
            Double valorNota = nota.getValue();
            System.out.println(nome + " : " + valorNota);
        }


    }
}
