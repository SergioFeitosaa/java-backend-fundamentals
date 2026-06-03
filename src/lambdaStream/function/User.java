package lambdaStream.function;

import java.util.function.Function;

public class User {
    public static void main(String[] args) {
        Function<String, Integer> contadorLetras = nome -> nome.length();
        System.out.println(contadorLetras.apply("Sérgio"));
        System.out.println(contadorLetras.apply("Maria"));

        Function<String, String> letraMaiscula = nome -> nome.toUpperCase();
        System.out.println(letraMaiscula.apply("Sérgio"));
        System.out.println(letraMaiscula.apply("Maria"));
    }



}
