package expressoesComparativas;

import java.util.Scanner;

// Leia um número e verifique:
// Se ele é positivo e par → "Número positivo e par"
// Caso contrário → "Não atende às duas condições"

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        if (numero > 0 &&  numero %2==0) {
            System.out.println("Número positivo e par");
            
        }else {
            System.out.println("Não atende às duas condições");
        }
        
        scanner.close();
    }
    
}
