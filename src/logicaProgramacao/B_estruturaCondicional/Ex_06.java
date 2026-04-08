package logicaProgramacao.B_estruturaCondicional;

import java.util.Scanner;

public class Ex_06 {
//    Crie um programa que solicite ao usuário dois números inteiros,
//    compare-os e exiba uma mensagem indicando qual é o maior ou se ambos são iguais.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o 1ª número: ");
        int number1 = scanner.nextInt();

        System.out.println("Digite o 2ª número: ");
        int number2 = scanner.nextInt();

        if (number1 > number2){
            System.out.println("O maior número é: " + number1);
        } else if (number1 < number2) {
            System.out.println("O maior número é: " + number2);
        }else {
            System.out.println("Os dois números são iguais");
        }
        scanner.close();
    }
}
