package logicaProgramacao.B_estruturaCondicional;

import java.util.Scanner;

//A regra da escola é:
//O estudante é aprovado se média final é maior ou igual a 7.0.
//Se a média for entre 5.0 e 6.9, está de recuperação.
//Se for abaixo de 5.0, está reprovado.

public class Ex_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua nota: ");
        double nota = scanner.nextDouble();

        if (nota >= 7.0){
            System.out.println("Aluno aprovado");
        } else if (nota >= 5.0) {
            System.out.println("Aluno em recuperação");
        }else {
            System.out.println("Aluno reprovado");
        }

    }
}
