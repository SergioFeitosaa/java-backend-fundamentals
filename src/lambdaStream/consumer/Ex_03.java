package lambdaStream.consumer;

import java.util.List;

public class Ex_03 {
    private String nome;
    private double saldo;

    public Ex_03(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Ex_03 usuario1 = new Ex_03("João", 500);
        Ex_03 usuario2 = new Ex_03("Maria", 2500);
        Ex_03 usuario3 = new Ex_03("Carlos", 100);
        Ex_03 usuario4 = new Ex_03("Ana", 5000);

        List.of(usuario1, usuario2, usuario3, usuario4)
                .stream()
                .filter(cliente -> cliente.getSaldo() > 1000)
                .forEach(cliente -> System.out.println("CLIENTE VIP: " + cliente.getNome().toUpperCase() + " - SALDO: "  +
                        cliente.getSaldo()));
    }
}
