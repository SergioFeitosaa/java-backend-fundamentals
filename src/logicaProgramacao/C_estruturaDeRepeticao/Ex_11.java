package logicaProgramacao.C_estruturaDeRepeticao;

public class Ex_11 {
    //Mostre os números de 1 até 20
// MAS: Se o número for par → mostre: "X é par"
//Se for ímpar → mostre: "X é ímpar"
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++){
            if (i %2 == 0){
                System.out.println(i + " é par");
            }else  {
                System.out.println(i + " é impar");
            }
        }
    }



}
