package expressoesComparativas;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        System.out.println("Digite sua nota");
        Scanner scanner = new Scanner(System.in);

        double nota = scanner.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovado");
        }else if (nota >= 5 && nota < 7) {
                System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();

    }
    
}
