package expressoesComparativas;

import java.util.Scanner;

// Leia um número e verifique:
// Se ele é maior que 0 → mostrar "Positivo"
// Se ele é menor que 0 → mostrar "Negativo"
// Se ele é igual a 0 → mostrar "Zero"

public class Ex03 {
    public static void main(String[] args) {
        System.out.println("Digite um número");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Positivo");
            
        }else if (number < 0 ) {
            System.out.println("Negativo");
        }else {
            System.out.println("Zero");
        }
            
        scanner.close();
        
    }
    
}
