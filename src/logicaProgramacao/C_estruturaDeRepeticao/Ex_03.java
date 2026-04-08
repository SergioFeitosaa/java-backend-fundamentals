package C_estruturaRepeticaoFor;

import java.util.Scanner;

public class Ex_03 {
//    Peça para o usuário digitar números.
//    Enquanto o número digitado for positivo (> 0):
//    Some os números digitados.
//    Quando ele digitar um número negativo:
//    O programa deve parar
//    Mostrar a soma total dos números positivos digitados.

    public static void main(String[] args) {

        int contador = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");

        int numero = scanner.nextInt();

        while (numero > 0) {

            contador += numero;

            System.out.println("Digite um numero: ");
            numero = scanner.nextInt();
        }
        System.out.println("Soma total: " + contador);
        scanner.close();
    }
}
