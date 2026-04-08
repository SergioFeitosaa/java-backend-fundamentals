package logicaProgramacao.C_estruturaDeRepeticao;

public class Ex_12 {
//    Mostre os números de 1 até 50.
//    Mas:
//    Se for divisível por 3 → mostre: "Fizz"
//    Se for divisível por 5 → mostre: "Buzz"
//    Se for divisível por 3 e 5 ao mesmo tempo → mostre: "FizzBuzz"
//    Caso contrário → mostre o número
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 ==0) {
                System.out.println("Buzz");
            } else if (i % 5 == 0) {
                System.out.println("FizzBuzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
