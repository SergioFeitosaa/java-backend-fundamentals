package logicaProgramacao.B_estruturaCondicional;

import java.util.Scanner;

public class Ex_08 {
//    O desconto é aplicado apenas se o valor da compra for maior ou igual a R$ 100,00. Para isso,
//    ele quer um programa que permita inserir o valor da compra e exiba se o desconto foi aplicado ou não,
//    juntamente com o novo valor após o desconto, caso aplicável.
//    Com base nesse cenário, crie um programa que receba o valor da compra e exiba uma mensagem informando se o desconto foi
//    aplicado ou não.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");

        double valorCompra = scanner.nextDouble();

        if (valorCompra >= 100) {
            double desconto = valorCompra * 0.10;
            double valorComDesconto = valorCompra - desconto;
            System.out.printf("Desconto de 10% aplicado");
        }else {
            System.out.println("Desconto não aplicado.\nValor total: R$" + valorCompra );
        }

    }
}
