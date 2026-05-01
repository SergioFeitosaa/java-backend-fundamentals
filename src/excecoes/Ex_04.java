package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
//      Tratar erro quando o usuário digita algo inválido.
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();
            System.out.println("voce digitou: " + numero);


        } catch (InputMismatchException e) {
            System.out.println("Erro: você precisa digitar um número válido");
            scanner.nextInt();
        }

    }
}
