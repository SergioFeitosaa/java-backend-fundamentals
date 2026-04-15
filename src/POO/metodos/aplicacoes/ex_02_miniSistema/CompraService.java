package POO.metodos.aplicacoes.ex_02_miniSistema;

public class CompraService {

    boolean temSaldo(double saldo, double valor) {
        return saldo >= valor;
    }

    String realizarCompra(String nome, double saldo, double valor) {
        if (!temSaldo(saldo, valor)) {
            return "Saldo insuficiente";
        } else {
            return "Compra realizada para " + nome;
        }
    }
}
