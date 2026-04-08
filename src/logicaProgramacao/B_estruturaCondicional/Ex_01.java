package logicaProgramacao.B_estruturaCondicional;

import java.util.Scanner;

public class Ex_01 {
//    Identificar e corrigir o erro de escopo de variáveis no código.
//    Garantir que o programa exiba a mensagem correta com base na idade da pessoa, no código abaixo a saída será
//    Você é menor de idade.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();

        if (age <= 17){
            System.out.println("Menor de idade");
        }else {
            System.out.println("Maior de idade");
        }

    }
}
