package C_estruturaRepeticaoFor;

import java.util.Scanner;

public class Ex_04 {
//    Peça números ao usuário. Enquanto ele digitar números positivos (> 0):
//    Some os números, Conte quantos números foram digitados, Quando ele digitar um número negativo:
//    Mostre:
//    A soma total
//    A quantidade de números
//    A média dos números digitados

    public static void main(String[] args) {

        int soma = 0;
        int contador = 0;
        double media = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int numero = scanner.nextInt();

        while (numero > 0) {

            soma += numero;
            contador++;

            System.out.println("Digite um numero maior que 0 para somar (menor que 0 para sair)");
            numero = scanner.nextInt();

        }

        if (contador > 0) {
            media = (double) soma / contador;
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }
        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println("Quantidade de números digitados foi: " + contador);
        System.out.println("A média dos números digitados é: " + media);
    }
}
