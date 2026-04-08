package C_estruturaRepeticaoFor;

//Peça para o usuário digitar números.
//Enquanto o número digitado for diferente de 0:
//Mostre o número digitado
//Quando ele digitar 0:
//O programa encerra.

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número (0 para sair): ");
        int numero = scanner.nextInt();

        while (numero != 0){
            System.out.println("você digitou: " + numero);

            System.out.println("Digite outro número (0 para sair): ");
            numero = scanner.nextInt();
        }
        System.out.println("Programa encerrado: ");
        scanner.close();
    }

}
