package lambdaStream.predicate.fIlter;

import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<Integer> numerosPositivos =
                List.of(10, -2, 7, -5, 20)
                        .stream()
                        .filter(numero -> numero > 0)
                        .toList();


        System.out.println("Numeros positovos: " + numerosPositivos);
    }
}
