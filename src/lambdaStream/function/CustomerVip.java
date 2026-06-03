package lambdaStream.function;

import java.util.List;

public class CustomerVip {
    private String nome;
    private double Saldo;
    private boolean ativo;

    public CustomerVip(String nome, double saldo, boolean ativo) {
        this.nome = nome;
        this.Saldo = saldo;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return Saldo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    @Override
    public String toString() {
        return "CustomerVip{" +
                "nome='" + nome + '\'' +
                ", Saldo=" + Saldo +
                ", ativo=" + ativo +
                '}';
    }

    public static void main(String[] args) {

        CustomerVip customerVip1 = new CustomerVip("Maria", 5000, true);
        CustomerVip customerVip2 = new CustomerVip("Carlos", 200, false);
        CustomerVip customerVip3 = new CustomerVip("Ana", 3000, true);
        CustomerVip customerVip4 = new CustomerVip("João", 100, false);

        List<CustomerVip> customerVips = List.of(customerVip1, customerVip2, customerVip3, customerVip4);
        List<String> clienteVips = customerVips.stream()
                .filter(customerVip -> customerVip.isAtivo())
                .map(customerVip -> "CLIENTE VIP: " + customerVip.getNome().toUpperCase())
                .toList();

        System.out.println(clienteVips);
    }
}
