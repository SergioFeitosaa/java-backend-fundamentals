package logicaProgramacao.B_estruturaCondicional;

//Faça um programa que:
//Leia:Peso (double), Altura (double), Calcule o IMC:
//IMC = peso / (altura * altura)
//Classifique: IMC < 18.5 → Abaixo do peso, IMC < 25 → Peso normal, IMC < 30 → Sobrepeso
//Senão → Obesidade

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        if (peso <= 0 || altura <= 0) {
            System.out.println("Valores inválidos");

        } else {
            double IMC = peso / (altura * altura);
            System.out.println("Seu IMC é: " + IMC);

            if (IMC < 18.5) {
                System.out.println("Abaixo do peso");
            } else if (IMC < 25) {
                System.out.println("Peso Normal");
            } else if (IMC < 30) {
                System.out.println("Sobrepeso");
            } else {
                System.out.println("Obesidade");
            }

        }

        scanner.close();
    }
    
}