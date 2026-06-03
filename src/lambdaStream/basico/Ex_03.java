package lambdaStream.basico;

@FunctionalInterface
interface Soma {
    int calcular(int a, int b);
}

public class Ex_03 {
    public static void main(String[] args) {
        Soma soma = (a, b) -> a + b;

        System.out.println(soma.calcular(10, 5));
    }
}
