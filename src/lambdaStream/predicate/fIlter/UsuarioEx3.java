package lambdaStream.predicate.fIlter;

import java.util.List;
import java.util.function.Predicate;

public class UsuarioEx3 {

    private String nome;
    private int idade;

    public UsuarioEx3(String nome, int idade) {
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
        return "UsuarioEx3{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public static void main(String[] args) {
        UsuarioEx3 usuario1 = new UsuarioEx3("Ana", 25);
        UsuarioEx3 usuario2 = new UsuarioEx3("Amanda", 16);
        UsuarioEx3 usuario3 = new UsuarioEx3("Carlos", 30);
        UsuarioEx3 usuario4 = new UsuarioEx3("André", 19);

        Predicate<UsuarioEx3> usuarioComAEAdulto =
                usuarioEx3 -> usuarioEx3.getNome().startsWith("A")
                        && usuarioEx3.getIdade() > 18;

        List<UsuarioEx3> usuarios = List.of(usuario1, usuario2, usuario3, usuario4)
                .stream()
                .filter(usuarioComAEAdulto)
                .toList();

        System.out.println(usuarios);
    }
}
