package logicaProgramacao.C_estruturaDeRepeticao;

//Faça um programa que: Percorra de 1 até 100, Some apenas os números múltiplos de 3
//No final mostre: A soma total, Quantos múltiplos de 3 foram encontrados
//⚠ Não mostre os números.
//Só mostre o resultado final.

public class Ex_09 {
    public static void main(String[] args) {
        int soma = 0;
        int contador = 0;

        for (int i = 3; i <= 100; i+=3) {
            if (i % 3 == 0) {
                soma+= i;
                contador++;
            }
        }
        System.out.println("soma: " + soma);
        System.out.println("Múltiplos de 3 " + contador);
    }
}
