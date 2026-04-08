package C_estruturaRepeticaoFor;
//Peça números ao usuário.
//Enquanto ele não digitar 0:
//Conte quantos números foram digitados.
//Quando ele digitar 0:

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = 0;

        System.out.print("Digite um número ou (0 para sair): ");
        int numero = scanner.nextInt();

        while (numero != 0){

            quantidade++;

            System.out.println("Digite um número ou (0 para sair))");
            numero = scanner.nextInt();

        }
        System.out.println("Você digitou " + quantidade + " números.");
        scanner.close();
    }
}
