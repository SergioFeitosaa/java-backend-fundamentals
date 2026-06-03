package lambdaStream.predicate.fIlter;

import java.util.List;
import java.util.function.Predicate;

public class UsuarioEx4 {
    private String nome;
    private int idade;

    public UsuarioEx4(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "UsuarioEx4{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public static void main(String[] args) {
        UsuarioEx4 usuario1 = new UsuarioEx4("Ana", 25);
        UsuarioEx4 usuario2 = new UsuarioEx4("Amanda", 16);
        UsuarioEx4 usuario3 = new UsuarioEx4("Carlos", 30);
        UsuarioEx4 usuario4 = new UsuarioEx4("André", 19);

        Predicate<UsuarioEx4> usuarioComA = usuarioEx4 ->
                usuarioEx4.getNome().startsWith("A");

        Predicate<UsuarioEx4> usuarioAdulto = usuarioEx4 ->
                usuarioEx4.getIdade() > 18;

        List<UsuarioEx4> usuarios = List.of(usuario1, usuario2,usuario3,usuario4)
                .stream()
                .filter(usuarioComA)
                .filter(usuarioAdulto)
                .toList();

        System.out.println(usuarios);
    }
}
