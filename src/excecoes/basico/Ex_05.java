package excecoes.basico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_05 {
//    Crie um programa em Java que: Peça ao usuário dois números inteiros, Faça a divisão do primeiro pelo segundo
//    Mostre o resultado
//    Requisitos técnicos : usar Scanner, usar try-catch, usar mais de um catch, mostrar mensagens claras para o usuário
//    o programa deve continuar funcionando até o final (não pode crashar)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um número inteiro");
            int numero1 = scanner.nextInt();

            System.out.println("Digite outro número inteiro");
            int numero2 = scanner.nextInt();

            int resultado = numero1/numero2;
            System.out.println("Resultado: " + resultado);

        }catch (InputMismatchException e){
            System.out.println("Entrada inválida!");
            scanner.nextInt();
        }catch (ArithmeticException e){
            System.out.println("Erro: divisão por zero não é permitida!");
            System.out.println("detalhe técnico: " + e.getMessage());
        }finally {
            System.out.println("Programa finalizado");
            scanner.close();
        }
    }
}
