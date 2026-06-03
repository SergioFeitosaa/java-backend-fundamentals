package lambdaStream.map;

import java.util.List;

public class UsuarioMap2 {
    private String nome;
    private double saldo;

    public UsuarioMap2(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String
    toString() {
        return "UsuarioMap2{" +
                "nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public static void main(String[] args) {
        UsuarioMap2 usuario1 = new UsuarioMap2("João", 500);
        UsuarioMap2 usuario2 = new UsuarioMap2("Maria", 2500);
        UsuarioMap2 usuario3 = new UsuarioMap2("Carlos", 100);
        UsuarioMap2 usuario4 = new UsuarioMap2("Ana", 5000);

        List<UsuarioMap2> usuarios = List.of(usuario1, usuario2, usuario3, usuario4);

        List<String> nomes = usuarios.stream()
                        .filter(usuarioMap2 -> usuarioMap2.getSaldo() > 1000)
                        .map(usuarioMap2 -> usuarioMap2.getNome())
                        .toList();

        System.out.println(nomes);

    }
}
