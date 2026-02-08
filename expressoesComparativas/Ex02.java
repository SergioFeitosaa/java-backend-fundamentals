package expressoesComparativas;

import java.util.Scanner;

// Leia um número e verifique se ele é igual a zero.

public class Ex02 {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("O numero digitado é igual a zero!"); 
            
        }else {
            System.out.println("O número digitado náo é igual a zero!");
        }

        scanner.close();
    }
    
}
