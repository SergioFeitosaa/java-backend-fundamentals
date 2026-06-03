package lambdaStream.map;

import java.util.List;

public class UsuarioMap3 {
    private String nome;
    private double saldo;

    public UsuarioMap3(String nome, double saldo) {
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
        UsuarioMap3 usuario1 = new UsuarioMap3("João", 500);
        UsuarioMap3 usuario2 = new UsuarioMap3("Maria", 2500);
        UsuarioMap3 usuario3 = new UsuarioMap3("Carlos", 100);
        UsuarioMap3 usuario4 = new UsuarioMap3("Ana", 5000);

        List<UsuarioMap3> usuarios = List.of(usuario1, usuario2, usuario3, usuario4);

        List<String> clientesVip =
                usuarios.stream()
                        .filter(cliente -> cliente.getSaldo() > 1000)
                        .map(cliente -> cliente.getNome() + " tem saldo VIP")
                        .toList();

        System.out.println(clientesVip);
    }
}
