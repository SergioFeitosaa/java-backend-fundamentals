package lambdaStream.predicate;

import java.util.function.Predicate;
//Agora vamos usar String, porque backend trabalha MUITO com texto.
//Crie um Predicate para responder:
//o nome começa com a letra "A"?
//Regras "Ana" → true, "Carlos" → false, "Amanda" → true


public class NomeComA {
    public static void main(String[] args) {
        Predicate<String> nomeComA = nome -> nome.startsWith("A");

        System.out.println(nomeComA.test("Ana"));
        System.out.println(nomeComA.test("Carlos"));
        System.out.println(nomeComA.test("Amanda"));
    }
}
