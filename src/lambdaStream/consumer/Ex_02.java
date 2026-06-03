package lambdaStream.consumer;

import java.util.List;
import java.util.function.Consumer;

public class Ex_02 {
    public static void main(String[] args) {
        List.of("Carlos", "Amanda", "João", "Ana")
                        .stream()
                        .filter(nome -> nome.startsWith("A"))
                        .forEach(nome -> System.out.println("olá, " + nome));
    }
}
