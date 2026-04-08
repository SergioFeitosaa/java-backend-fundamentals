package logicaProgramacao.B_estruturaCondicional;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia da semana (em letras minúsculas): ");

        String dia = scanner.nextLine();

        if (dia.equals("segunda") || dia.equals("terça") || dia.equals("quarta") || dia.equals("quinta") || dia.equals("sexta")){
            System.out.println(dia + " é um dia útil");
        }else {
            System.out.println("Não é umm dia útil");
        }
    }
}
