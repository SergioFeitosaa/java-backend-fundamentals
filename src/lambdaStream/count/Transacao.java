package lambdaStream.count;

import java.util.List;

public class Transacao {
    private String tipo;
    private int valor;
    private boolean aprovada;

    public Transacao(String tipo, int valor, boolean aprovada) {
        this.tipo = tipo;
        this.valor = valor;
        this.aprovada = aprovada;
    }

    public String getTipo() {
        return tipo;
    }

    public int getValor() {
        return valor;
    }

    public boolean isAprovada() {
        return aprovada;
    }


    public static void main(String[] args) {
        Transacao transacao1 = new Transacao("PIX", 1500, true);
        Transacao transacao2 = new Transacao("TED", 5000, true);
        Transacao transacao3 = new Transacao("BOLETO", 300, false);
        Transacao transacao4 = new Transacao("PIX", 200, true);

        List<Transacao> transacoes = List.of(transacao1, transacao2, transacao3, transacao4);
        long transaoAprovada = transacoes.stream()
                .filter(Transacao::isAprovada)
                .count();

        System.out.println(transaoAprovada);
    }

}
