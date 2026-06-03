package lambdaStream.predicate;

//Crie um Predicate para responder:
//número é par
import java.util.function.Predicate;

public class NumeroPar {
    public static void main(String[] args) {
        Predicate <Integer> numeroPar = numero -> numero % 2 == 0;
        System.out.println(numeroPar.test(10));
        System.out.println(numeroPar.test(7));
        System.out.println(numeroPar.test(2));
    }
}
