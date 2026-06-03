package lambdaStream.predicate;

import java.util.function.Predicate;

public class NumeroPositivo {
    public static void main(String[] args) {
        Predicate<Integer> numeroPositivo = numero -> numero > 0 ;

        System.out.println(numeroPositivo.test(10));
        System.out.println(numeroPositivo.test(0));
        System.out.println(numeroPositivo.test(-5));

    }
}
