package logicaProgramacao.A_variavesTiposPrimitivos;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digeite um número: ");

        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número digitado é par");
        }else {
            System.out.println("O número digitado é impar");
        }

        scanner.close();

    }
}
