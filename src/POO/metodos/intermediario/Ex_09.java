package POO.metodos.intermediario;

public class Ex_09 {
    boolean temSaldo(double saldo, double valor) {
        return saldo >= valor;
    }

    String realizarCompra(String nome, double saldo, double valor) {
        if (temSaldo(saldo, valor)) {
            return "Compra aprovada para " + nome;
        } else {
            return "Saldo insuficiente";
        }

    }

    public static void main(String[] args) {
        Ex_09 pessoa = new Ex_09();
        String resultado = pessoa.realizarCompra("João", 50, 20);
        System.out.println(resultado);
    }
}
