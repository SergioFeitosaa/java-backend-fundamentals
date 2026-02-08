package expressoesComparativas;

import java.util.Scanner;


// Leia a idade de uma pessoa e mostre:
// Se idade ≥ 18 → "Maior de idade"
// Caso contrário → "Menor de idade"

public class Ex04 {
     public static void main(String[] args) {
        System.out.println("Digite sua idade");
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Maior de idade");
        }else {
            System.out.println("Menor de idade");
        }

        scanner.close();
     }

     
}
