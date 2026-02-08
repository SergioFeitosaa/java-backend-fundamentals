package expressoesComparativas;

import java.util.Scanner;

//“Leia um número e mostre se ele é maior que 10.

public class Ex01 {

    public static void main(String[] args) {
        
        System.out.println("Digite um numero maior que 10: ");
        Scanner scanner = new Scanner(System.in);

        int number = 10;
        number = scanner.nextInt();

        if (number > 10) {
            System.out.println("O número digitado é maior que 10!");
        }else {
            System.out.println("o Número digitado não é maior que 10!");
        }

        scanner.close();

    }
    
}