package excecoes.customExceptions.validacaoCustomExceptions3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ValidadorNumero validadorNumero = new ValidadorNumero();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um número");
            int numero = scanner.nextInt();

            validadorNumero.validar(numero);

            System.out.println("Número válido: " + numero);

        } catch (NumeroNegativoException | NumeroZeroException e) {
            System.out.println("Erro: " + e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Digite um número válido!");
        }

        scanner.close();
    }
}
