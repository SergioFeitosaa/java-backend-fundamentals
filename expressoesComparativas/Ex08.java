package expressoesComparativas;

import java.util.Scanner;

// Leia a idade de uma pessoa e o preço de um ingresso. Mostre:
// Se a pessoa for menor de 12 anos → paga meia
// Se tiver 60 anos ou mais → paga meia
// Caso contrário → paga valor inteiro
// Mostre o valor final que ela vai pagar.

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o preço do ingresso");
        double precoIngresso = scanner.nextDouble();

        double valorFinal;

        if (idade <= 12 || idade >= 60) {
                valorFinal = precoIngresso / 2;
               System.out.println(" Paga meia entrada");
        }else {
            valorFinal = precoIngresso;
            System.out.println("Paga inteira");
        }
        
        System.out.println("Valor a pagar: R$ " + valorFinal);

        scanner.close();
    }
}    

