package logicaProgramacao.B_estruturaCondicional;

import java.util.Scanner;

public class Ex_03 {

//criar um programa que, com base em uma senha pré-definida, por exemplo: 123456, verifique se o que o usuário digitou está correto ou não.
//O programa deve comparar a tentativa com a senha correta e exibir se o acesso foi permitido ou negado.

    public static void main(String[] args) {
        String senhaCorreta = "123456";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String tentativaSenha = scanner.nextLine();

        if (senhaCorreta.equals(tentativaSenha)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }

        scanner.close();
    }
}
