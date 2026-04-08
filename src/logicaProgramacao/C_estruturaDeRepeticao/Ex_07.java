package logicaProgramacao.C_estruturaDeRepeticao;

public class Ex_07 {
//    Faça um for que: Imprima apenas números pares de 1 até 20
//    Depois faça outra versão que use if para filtrar os pares

    public static void main(String[] args) {
        for (int i = 0; i <= 20; i += 2) {
            System.out.println("Números pares sem if: " + i);
        }

        System.out.println("-------------------");

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Numeros pares com if: " + i);
            }
        }

    }
}
