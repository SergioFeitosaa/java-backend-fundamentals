package lambdaStream.basico;

@FunctionalInterface
interface MaiorIdade {
    boolean verificar (int idade);
}

public class Ex_04 {
    public static void main(String[] args) {
        MaiorIdade maiorIdade = idade -> idade >= 18;

        System.out.println(maiorIdade.verificar(20));
        System.out.println(maiorIdade.verificar(15));
    }

}
