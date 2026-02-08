package expressoesComparativas;

import java.util.Scanner;

// Leia a idade de uma pessoa e informe se ela pode dirigir.
// Ela só pode dirigir se tiver 18 anos ou mais e possuir carteira de motorista (S/N).


public class Ex06 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Informa sua idade");
        int age = scanner.nextInt();

        System.out.println("Possui carteira de motorista? S/N" );
        String carteira = scanner.next();


        if (age >= 18 && carteira.equalsIgnoreCase("S")  ) {
            System.out.println("Pode dirigir e possui carteira de motorista");
        }else{
            System.out.println("Náo pode dirigir e náo possui carteira de motorista");
        }
        
        scanner.close();
    }
}
