package C_estruturaRepeticaoFor;

import java.util.Scanner;

public class Ex_05 {
    //    Peça números ao usuário. Enquanto ele digitar números positivos (> 0):
//    Se o número for par, some ele
//    Se for ímpar, ignore
//    Quando ele digitar número negativo Mostre:
//    A soma apenas dos números pares
//    Quantos números pares foram digitados
    public static void main(String[] args) {
        int soma = 0;
        int contadorNumerosPares = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        while (numero > 0) {

            if (numero % 2 == 0){
                soma += numero;
                contadorNumerosPares++;
            }

            System.out.println("Digite um número (menor que 0 para sair): ");
            numero = scanner.nextInt();
        }

        System.out.println("Soma pares é: " + soma);
        System.out.println("Quantidades de números pares digitados: " + contadorNumerosPares);

    }
}
