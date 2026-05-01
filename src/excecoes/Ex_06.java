package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_06 {
    //  Melhore seu programa para:
//      Continuar pedindo os números até o usuário acertar
//      Só sair do loop quando: os dois números forem válidos, e a divisão for possível
//      Requisitos: usar while, tratar exceções, limpar o Scanner corretamente, só encerrar quando tudo der certo

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean valido = false;
        int resultado = 0;

        while (!valido) {
            try {
                System.out.print("Digite o primeiro número inteiro: ");
                int numero1 = scanner.nextInt();

                System.out.print("Digite o segundo número inteiro: ");
                int numero2 = scanner.nextInt();

                resultado = numero1 / numero2;

                valido = true; // ✔ deu tudo certo

            } catch (InputMismatchException e) {
                System.out.println("Erro: digite apenas números inteiros!");
                scanner.nextLine();

            } catch (ArithmeticException e) {
                System.out.println("Erro: divisão por zero não é permitida!");
            }
        }

        System.out.println("Resultado: " + resultado);
        System.out.println("Programa finalizado.");

        scanner.close();

    }
}
