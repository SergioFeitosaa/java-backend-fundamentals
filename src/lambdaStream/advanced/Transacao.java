package lambdaStream.advanced;

import java.util.List;

public class Transacao {
    private String atributos;
    private double valor;
    private boolean aprovada;

    public Transacao(String atributos, double valor, boolean aprovada) {
        this.atributos = atributos;
        this.valor = valor;
        this.aprovada = aprovada;
    }

    public String getAtributos() {
        return atributos;
    }

    public double getValor() {
        return valor;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public static void main(String[] args) {
        Transacao transacao1 = new Transacao("PIX", 1500, true);
        Transacao transacao2 = new Transacao("TED", 5000, true);
        Transacao transacao3 = new Transacao("PIX", 200, true);
        Transacao transacao4 = new Transacao("BOLETO", 300, false);

        List<Transacao> transacaos = List.of(transacao1, transacao2, transacao3, transacao4);
        List<String> transacaoAprovada = transacaos.stream()
                .filter(transacao -> transacao.isAprovada())
                .map(transacao -> "TRANSAÇÃO APROVADA: " + transacao.getAtributos().toUpperCase() + " - " +
                        transacao.getValor())
                .toList();
        System.out.println(transacaoAprovada);
    }
}
