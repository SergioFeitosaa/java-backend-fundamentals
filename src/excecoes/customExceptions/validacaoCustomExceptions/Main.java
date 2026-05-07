package excecoes.customExceptions.validacaoCustomExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um número");
            int numero = scanner.nextInt();

            if (numero < 0) {
                throw new NumeroNegativoException("Número não pode ser negativo");
            }

            System.out.println("Número digitado: " + numero);

        } catch (NumeroNegativoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: digite um número válido!");
        }

        scanner.close();

    }

}
