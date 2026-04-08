package logicaProgramacao.C_estruturaDeRepeticao;

public class Ex_08 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 1) {
                System.out.println("Números ímpares com: " + i);
            }
        }

        for (int i = 50; i >= 0; i--){
            System.out.println("Números decrescente: " + i);
        }


    }


}
