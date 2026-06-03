package lambdaStream.basico;

@FunctionalInterface
interface Saudacao {
    void falar(String nome);
}

public class Ex_02 {
    public static void main(String[] args) {
        Saudacao mensagem = (nome) -> System.out.println("olá, " + nome);
                mensagem.falar("Sérgio");
    }
}
