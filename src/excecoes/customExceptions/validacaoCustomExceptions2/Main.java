package excecoes.customExceptions.validacaoCustomExceptions2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                throw new NumeroNegativoException("Número negativo não permitido");
            }

            if (numero == 0) {
                throw new NumeroZeroException("Número digitando não pode ser 0");
            }

        } catch (NumeroNegativoException | NumeroZeroException e){

            System.out.println("Erro: " + e.getMessage());

        } catch(InputMismatchException e){
            System.out.println("Digite um número valido");
        }

        scanner.close();

    }
}
