package lambdaStream.basico;

@FunctionalInterface
interface Mensagem {
    void enviar ();
}

public class Ex_01 {
    public static void main(String[] args) {
       Mensagem mensagem = () -> System.out.println("Mensagem enviada!");
       mensagem.enviar();
    }
}
