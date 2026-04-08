package logicaProgramacao.B_estruturaCondicional;

import java.util.Scanner;

public class Ex_05 {
//    Leia a idade de uma pessoa e mostre:
//    Se idade entre 0 e 12 → "Criança"
//    Se idade entre 13 e 17 → "Adolescente"
//    Se idade entre 18 e 59 → "Adulto"
//    Se idade 60 ou mais → "Idoso"

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");

        int age = scanner.nextInt();

        if (age <= 12) {
            System.out.println("Criança");
        } else if (age <= 17) {
            System.out.println("Adolescente");
        } else if (age <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}
