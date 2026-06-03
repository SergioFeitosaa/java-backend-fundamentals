package lambdaStream.consumer;

import java.util.function.Consumer;

public class Ex_01 {
    public static void main(String[] args) {
        Consumer<String> imprimir =
                nome -> System.out.println("Bem-vindo, " + nome);
        imprimir.accept("Sérgio");
        imprimir.accept("Carlos");
    }


}
