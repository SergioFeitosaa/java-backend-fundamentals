package logicaProgramacao.C_estruturaDeRepeticao;

public class Ex_06 {
//    Faça um programa que:
//    Imprima os números de 1 até 10 usando for.
//    Depois faça:
//    Imprimir de 10 até 1.
//    Sem usar while.

    public static void main(String[] args) {
        for (int i = 1; i <=10; i++){
            System.out.println("for crescente: " + i);
        }

        for (int i =10; i >= 0; i--){
            System.out.println("For descrecente: " + i);
        }
    }
}
