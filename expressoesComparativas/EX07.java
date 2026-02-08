package expressoesComparativas;

import java.util.Scanner;

// Leia o salário de uma pessoa e mostre:
// "Baixa renda"
// "Classe média"
// "Alta renda"

public class EX07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        double salario = scanner.nextDouble();

        if (salario <= 750.00) {
            System.out.println("Baixa renda");
        } else if (salario >= 750.00 && salario <= 28240) {
            System.out.println("Classe média");
        } else {
            System.out.println("Alta Renda");
        }
        
        scanner.close();
    }

}
