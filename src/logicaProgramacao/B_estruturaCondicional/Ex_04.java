package logicaProgramacao.B_estruturaCondicional;

import java.util.Scanner;

public class Ex_04 {
//    Leia um número e mostre:
//    Se ele está entre 50 e 100 inclusive → "Número dentro do intervalo estratégico"
//    Se ele é menor que 50 → "Número abaixo do esperado"
//    Se ele é maior que 100 → "Número acima do esperado"

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");

        double numero = scanner.nextDouble();

        if (numero >= 50 && numero <= 100) {
            System.out.println("Número dentro do intervalo estratégico");
        } else if (numero < 50) {
            System.out.println("Número abaixo do esperado");
        } else {
            System.out.println("Número acima do esperado");
        }

        scanner.close();
    }
}
